/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Date;
/**
 *
 * @author Thanh Trung
 */
public class Exam {
    public int id;
    public String code;
    public String title;
    public CategoryQuestion category;
    public int duration;
    public Account creator;
    public Question[] questions;
    public Date createDate;
}
