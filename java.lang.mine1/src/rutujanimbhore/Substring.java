package rutujanimbhore;
//*substring method
 public class Substring {
 public static void main(String[] args) {
  String str="hi i am rutuja";
  String str1=str.substring(6);//m rutuja
  System.out.println(str1);
  String str2=str.substring(7);
  System.out.println(str2);// rutuja
  
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  
  //*replace method
  String s="i am rutu";
  String s1=s.replace('i','I');
  System.out.println(s1);//I am rutu
  
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
  
  //*Uppercase and Lowercase;
  
  String s2=s.toUpperCase();
  System.out.println(s2);//I AM RUTU
  String s4=s2.toUpperCase();
  System.out.println(s2==s4);//true>> s2 pointing to heap object and also s4 pointing to s2 object created on heap
  String s3=s.toLowerCase();
  System.out.println(s3);//i am rutu
  
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
  
  //*Trim
  String p=" rutu kajal ";
  String p1=p.trim();
  System.out.println(p1);//rutu kajal>> removing starting space and ending space in string
 
  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
  
  //*indexof
  
  String q="hi hello how are you";
  System.out.println(q.indexOf('i'));//1 >> returning character index in string
  System.out.println(q.indexOf('z'));//-1 >> when character is not available in the string then index is [-1] given
  System.out.println(q.indexOf('w'));//11
  
}
}
