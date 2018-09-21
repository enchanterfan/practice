package notebook;

import java.util.ArrayList;
import java.util.HashSet;
//引入了一个类，这个类叫ArrayList,这个类在java.util的包中。

class Value{
    private int i;
    public void set(int i){this.i=i;}
    public int get(){return i;}
    public String toString(){return ""+i;}
    }

public class Notebook{
    private ArrayList<String> notes=new ArrayList<String>();
    //这种类型叫做范型类，这种范型类时一种容器。
    //notes本身是一个对象管理者，需要用new的方式将ArrayList<String>给生成出来。
    
    public void add(String s){
        notes.add(s);
        }
    public void add(String s,int location){
        notes.add(location,s);
    }
    public int getSize(){
        return notes.size();
        }
    public String getNote(int index){
        return notes.get(index);
        }
    public void removeNote(int index){
         notes.remove(index);
        }
    public String[] list(){
        String[]a=new String[notes.size()];
        /*for(int i=0;i<notes.size();i++){
            a[i]=notes.get(i);
            }*/
        notes.toArray(a);
        return a;
        }

    public static void main(String[] args){
    	
    	Value v=new Value();
    	v.set(10);
    	System.out.println(v);
    	//主动地调用toString函数，用toString函数产生的string来进行输出。以至于可以直接的用System.out.println
    	//来进行输出
    	
    	ArrayList<String> a=new ArrayList<String>();
    	a.add("first");
    	a.add("second");
    	a.add("first");
    	/*for(String s:a){
    	    System.out.println(s);
    	    }*/
    	System.out.println(a);
    	System.out.println(".............");
    	HashSet<String> s=new HashSet<String>();
    	//此set和数学中的set一致，为集合。集合中没有重复的元素
    	s.add("first");
    	s.add("second");
    	s.add("first");
    	/*for(String k:s){
    	    System.out.println(k);
    	    }*/
    	System.out.println(s);
    	
    	//这两个容器都可以用System.out.println()直接输出。输出的结果带着方括号说明其为一个容器，然后把容器中的值排列出来。
        //set这个容器输出的结果里的元素是无序的，因为集合是无序的。
         //对于类和容器类来说for each循环都可以用。

    	/*Value[] a=new Value[10];
        for(int i=0;i<a.length;i++){
            a[i]=new Value();
            a[i].set(i);
            }
        for (Value v:a){
            System.out.println(v.get());
            v.set(0);
            }
        for (Value v:a){
            System.out.println(v.get());
        }
        v这个变量指向了a[0]所管理的那个对象，以致v和a[0]两者共同管理原先a[0]所管理的那个对象。
        v.set(0)将v所指的那个对象的值变为0，下一轮又是v=a[1](即v指向了a[1]所管理的那个对象，接着又是v.set(0)，
                      以此类推，知道v指向a[9],所以最后输出来的值全部都是0。
        
        *
        */
        
    	/* int [] ia=new int[10];
         String[] a=new String[10];
         for(int i=0;i<a.length;i++){
             a[i]=""+i;
             }
         System.out.println(ia[0]+2);
         System.out.println(a[0].length());
         */
        
       /* Notebook nb=new Notebook();
        nb.add("first");
        nb.add("second");
        nb.add("third",1);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        String[] a=nb.list();
        for(String s:a){
            System.out.println(s);
        }*/

        }

    //ArrayList<String> notes=new ArrayList<String>
    //容器类可以用来存放对象，在里面可以存放任意数据类型。
    //容器类的变量在定义时需给有两个数据类型： 容器的类型 元素的类型
    //String s中的s变量并不会真的去放任何字符串，它只会管理在外面某处的字符串。
    //String类型的变量都是指向别的字符串的管理者
    //String[]类型的数组里面的每一个元素都不是字符串，它们都是指向一个别的字符串的管理者
    // 对象数组中的每个元素都是对象的管理者而非对象本身
   

	

}
