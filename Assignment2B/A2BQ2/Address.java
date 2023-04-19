//Maheshwar(2141014002)
package Assignment2B.A2BQ2;
/*
  Write a program to create a class named it as Address, having member
variable plot no, at, post and required member function. Create a
tree map having key as name of a person and value as address. Insert
required key and value in the created tree map and display it.
 */
import java.util.*;
public class Address{

      private int plotNo;
      private String at;
      private String post;
      
      public Address(int plotNo, String at, String post) {
          this.plotNo = plotNo;
          this.at = at;
          this.post = post;
      }
      
      public void setPlotNo(int plotNo) {
          this.plotNo = plotNo;
      }
      
      public void setAt(String at) {
          this.at = at;
      }
      
      public void setPost(String post) {
          this.post = post;
      }
      
      public int getPlotNo() {
          return plotNo;
      }
      
      public String getAt() {
          return at;
      }
      
      public String getPost() {
          return post;
      }
  }
  
class Tree{
      public static void main(String[] args) {
          TreeMap<String, Address> addressMap = new TreeMap<>();
          
          Address address1 = new Address(1, "Iter BH4", "208");
          Address address2 = new Address(2, "Iter BH4", "214");
          
          addressMap.put("maheshwar", address1);
          addressMap.put("Shubham", address2);
          
          for(Map.Entry<String, Address> entry : addressMap.entrySet()) {
              System.out.println("Name: " + entry.getKey());
              System.out.println("Address: " + entry.getValue().getPlotNo() + ", " 
                  + entry.getValue().getAt() + ", " + entry.getValue().getPost());
          }
      }
  }
  
