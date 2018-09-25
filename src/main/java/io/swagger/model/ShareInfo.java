package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShareInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T02:21:24.943Z")

public class ShareInfo   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("openId")
  private String openId = null;

  @JsonProperty("shareToId")
  private String shareToId = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("url")
  private String url = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    _0("0"),
    
    _1("1");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("createTime")
  private String createTime = null;

  @JsonProperty("updateTime")
  private String updateTime = null;

  public ShareInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "123456789", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShareInfo openId(String openId) {
    this.openId = openId;
    return this;
  }

  /**
   * Get openId
   * @return openId
  **/
  @ApiModelProperty(example = "fdjlafjdlsajfldjslafjdsla", value = "")


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public ShareInfo shareToId(String shareToId) {
    this.shareToId = shareToId;
    return this;
  }

  /**
   * Get shareToId
   * @return shareToId
  **/
  @ApiModelProperty(example = "djosugroejdsogfjdosgfds", value = "")


  public String getShareToId() {
    return shareToId;
  }

  public void setShareToId(String shareToId) {
    this.shareToId = shareToId;
  }

  public ShareInfo productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "12121212121", value = "")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public ShareInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "http://www.test.com", value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ShareInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "1", value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ShareInfo createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(example = "2018-09-24 21:47:00", value = "")


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ShareInfo updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(example = "", value = "")


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareInfo shareInfo = (ShareInfo) o;
    return Objects.equals(this.id, shareInfo.id) &&
        Objects.equals(this.openId, shareInfo.openId) &&
        Objects.equals(this.shareToId, shareInfo.shareToId) &&
        Objects.equals(this.productId, shareInfo.productId) &&
        Objects.equals(this.url, shareInfo.url) &&
        Objects.equals(this.status, shareInfo.status) &&
        Objects.equals(this.createTime, shareInfo.createTime) &&
        Objects.equals(this.updateTime, shareInfo.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, openId, shareToId, productId, url, status, createTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    shareToId: ").append(toIndentedString(shareToId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

