/*
 * bytescout.io
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2017-05-11T04:47:23Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bytescout.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * PdfSignRequestModelAnnotations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-11T14:49:35.132Z")
public class PdfSignRequestModelAnnotations {
  @SerializedName("text")
  private String text = null;

  @SerializedName("x")
  private BigDecimal x = null;

  @SerializedName("y")
  private BigDecimal y = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("fontName")
  private String fontName = null;

  @SerializedName("pages")
  private String pages = null;

  public PdfSignRequestModelAnnotations text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Annotation text
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "Annotation text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PdfSignRequestModelAnnotations x(BigDecimal x) {
    this.x = x;
    return this;
  }

   /**
   * X coordinate of the signature in PDF Points (1/72 in.)
   * @return x
  **/
  @ApiModelProperty(example = "null", value = "X coordinate of the signature in PDF Points (1/72 in.)")
  public BigDecimal getX() {
    return x;
  }

  public void setX(BigDecimal x) {
    this.x = x;
  }

  public PdfSignRequestModelAnnotations y(BigDecimal y) {
    this.y = y;
    return this;
  }

   /**
   * Y coordinate of the signature in PDF Points (1/72 in.)
   * @return y
  **/
  @ApiModelProperty(example = "null", value = "Y coordinate of the signature in PDF Points (1/72 in.)")
  public BigDecimal getY() {
    return y;
  }

  public void setY(BigDecimal y) {
    this.y = y;
  }

  public PdfSignRequestModelAnnotations size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Font size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "Font size")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public PdfSignRequestModelAnnotations color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Font color
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "Font color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public PdfSignRequestModelAnnotations fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Font name
   * @return fontName
  **/
  @ApiModelProperty(example = "null", value = "Font name")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public PdfSignRequestModelAnnotations pages(String pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Comma-separated list of page indices (or ranges) to process. Leave empty for all pages. Example: '0,2-5,7-'.
   * @return pages
  **/
  @ApiModelProperty(example = "null", value = "Comma-separated list of page indices (or ranges) to process. Leave empty for all pages. Example: '0,2-5,7-'.")
  public String getPages() {
    return pages;
  }

  public void setPages(String pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSignRequestModelAnnotations pdfSignRequestModelAnnotations = (PdfSignRequestModelAnnotations) o;
    return Objects.equals(this.text, pdfSignRequestModelAnnotations.text) &&
        Objects.equals(this.x, pdfSignRequestModelAnnotations.x) &&
        Objects.equals(this.y, pdfSignRequestModelAnnotations.y) &&
        Objects.equals(this.size, pdfSignRequestModelAnnotations.size) &&
        Objects.equals(this.color, pdfSignRequestModelAnnotations.color) &&
        Objects.equals(this.fontName, pdfSignRequestModelAnnotations.fontName) &&
        Objects.equals(this.pages, pdfSignRequestModelAnnotations.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, x, y, size, color, fontName, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSignRequestModelAnnotations {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

