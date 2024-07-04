package com.example.LIBRARY.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Book {


 @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long barcode;
 private String bookName;
 private String authurName;
 private String genre;//tür
 private Long year;//basım yılı

 //getter &setter


 public long getBarcode() {
  return barcode;
 }

 public void setBarcode(long barcode) {
  this.barcode = barcode;
 }

 public String getBookName() {
  return bookName;
 }

 public void setBookName(String bookName) {
  this.bookName = bookName;
 }

 public String getAuthurName() {
  return authurName;
 }

 public void setAuthurName(String authurName) {
  this.authurName = authurName;
 }

 public String getGenre() {
  return genre;
 }

 public void setGenre(String genre) {
  this.genre = genre;
 }

 public Long getYear() {
  return year;
 }

 public void setYear(Long year) {
  this.year = year;
 }
}
