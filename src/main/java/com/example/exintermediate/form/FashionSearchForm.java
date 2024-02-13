package com.example.exintermediate.form;

public class FashionSearchForm {
  private String category;
  private String genre;
  private String gender;
  private String color;
  private String price;
  private String size;

  /**
   * 
   * @param category カテゴリー
   * @param genre    ジャンル
   * @param gender   性別
   * @param color    カラー
   * @param price    価格
   * @param size     サイズ
   */

  /**
   * カテゴリーを取得する
   * 
   * @return カテゴリー
   */
  public String getCategory() {
    return category;
  }

  /**
   * カテゴリーを設定する
   * 
   * @param category カテゴリー
   */
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * ジャンルを取得する
   * 
   * @return ジャンル
   */
  public String getGenre() {
    return genre;
  }

  /**
   * ジャンルを設定する
   * 
   * @param genre
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * 性別を取得する
   * 
   * @return 性別
   */

  public String getGender() {
    return gender;
  }

  /**
   * 性別を設定する
   * 
   * @param gender 性別
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * カラーを取得する
   * 
   * @return カラー
   */

  public String getColor() {
    return color;
  }

  /**
   * カラーを設定する
   * 
   * @param color カラー
   */

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * 価格を取得する
   * 
   * @return 価格
   */
  public String getPrice() {
    return price;
  }

  /**
   * 価格を設定する
   * 
   * @param price 価格
   */
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * サイズを取得する
   * 
   * @return サイズ
   */
  public String getSize() {
    return size;
  }

  /**
   * サイズを設定する
   * 
   * @param size サイズ
   */
  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "FashionSearchForm [category=" + category + ", genre=" + genre + ", gender=" + gender + ", color=" + color + ", price=" + price + ", size=" + size + "]";
  }
}
