package notebook;

import java.util.ArrayList;
import java.util.HashSet;
//������һ���࣬������ArrayList,�������java.util�İ��С�

class Value{
    private int i;
    public void set(int i){this.i=i;}
    public int get(){return i;}
    public String toString(){return ""+i;}
    }

public class Notebook{
    private ArrayList<String> notes=new ArrayList<String>();
    //�������ͽ��������࣬���ַ�����ʱһ��������
    //notes������һ����������ߣ���Ҫ��new�ķ�ʽ��ArrayList<String>�����ɳ�����
    
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
    	//�����ص���toString��������toString����������string����������������ڿ���ֱ�ӵ���System.out.println
    	//���������
    	
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
    	//��set����ѧ�е�setһ�£�Ϊ���ϡ�������û���ظ���Ԫ��
    	s.add("first");
    	s.add("second");
    	s.add("first");
    	/*for(String k:s){
    	    System.out.println(k);
    	    }*/
    	System.out.println(s);
    	
    	//������������������System.out.println()ֱ�����������Ľ�����ŷ�����˵����Ϊһ��������Ȼ��������е�ֵ���г�����
        //set�����������Ľ�����Ԫ��������ģ���Ϊ����������ġ�
         //���������������˵for eachѭ���������á�

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
        v�������ָ����a[0]��������Ǹ���������v��a[0]���߹�ͬ����ԭ��a[0]��������Ǹ�����
        v.set(0)��v��ָ���Ǹ������ֵ��Ϊ0����һ������v=a[1](��vָ����a[1]��������Ǹ����󣬽�������v.set(0)��
                      �Դ����ƣ�֪��vָ��a[9],��������������ֵȫ������0��
        
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
    //���������������Ŷ�����������Դ�������������͡�
    //������ı����ڶ���ʱ����������������ͣ� ���������� Ԫ�ص�����
    //String s�е�s�������������ȥ���κ��ַ�������ֻ�����������ĳ�����ַ�����
    //String���͵ı�������ָ�����ַ����Ĺ�����
    //String[]���͵����������ÿһ��Ԫ�ض������ַ��������Ƕ���ָ��һ������ַ����Ĺ�����
    // ���������е�ÿ��Ԫ�ض��Ƕ���Ĺ����߶��Ƕ�����
   

	

}
