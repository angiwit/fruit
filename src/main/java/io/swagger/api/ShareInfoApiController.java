package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.generated.model.ShareInfo;
import io.swagger.generated.model.WechatShareInfo;
import io.swagger.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T12:10:50.957Z")

@Controller
public class ShareInfoApiController implements ShareInfoApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Value("${appId}")
    private String appId;

    @Value("${domain}")
    private String domain;

    private final static String wechatUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_base&state=share#wechat_redirect";

    private final static String callBackUrl = "http://%s/angiwit1/Fruit/1.0.0/oauth/callback/%s";

    @Autowired
    ShareService shareService;

    @org.springframework.beans.factory.annotation.Autowired
    public ShareInfoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<String> shareInfoPost(String openId) {
        return null;
    }

    @Override
    public ResponseEntity shareInfoGet(@PathVariable String openId) {
        ShareInfo shareInfo = shareService.selectByPrimaryKey(Integer.parseInt(openId));
        return ResponseEntity.ok(shareInfo);
    }

    @Override
    public ResponseEntity<WechatShareInfo> wechatShareInfo(@PathVariable String openId) {
        String fullCallbackUrl = URLEncoder.encode(String.format(callBackUrl, domain, openId));
        String fullWechatUrl = String.format(wechatUrl, appId, fullCallbackUrl);
        return ResponseEntity.ok(new WechatShareInfo("this is a test title for wechat share", "this is the desc for wechat share", fullWechatUrl, "http://p1.pstatp.com/large/31d80000314da2d4fc5d"));
    }
}
