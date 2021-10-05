import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner in=new FastScanner();
		String s=in.next();
                int length=s.length();
                HashMap<Character,Integer> map=new HashMap<>();
                
                for(int i=0;i< length;i++){
                    if(map.containsKey(s.charAt(i)))
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    else
                        map.put(s.charAt(i),1);
                }
                String ans="No";
                if(length<3){
                    int num=8;
                    while(num<100){
                        boolean flag=true;
                        String str=String.valueOf(num);
                        HashMap<Character,Integer> map1=new HashMap<>(map);
                       
                        for(int i=0;i<str.length();i++){
                               if(!map1.containsKey(str.charAt(i))||map1.get(str.charAt(i))<=0)
                                   flag=false;
                               else
                                   map1.put(str.charAt(i),map1.get(str.charAt(i))-1);
                        }
                        if(flag){
                            ans="Yes";
                            break;
                        }
                        num+=8;
                    }
                    System.out.println(ans);
                }
                else{
                    int num=104;
                    while(num<1000){
                        boolean flag=true;
                        String str=String.valueOf(num);
                        HashMap<Character,Integer> map1=new HashMap<>(map);
                       
                        for(int i=0;i<str.length();i++){
                               if(!map1.containsKey(str.charAt(i))||map1.get(str.charAt(i))<=0)
                                   flag=false;
                               else
                                   map1.put(str.charAt(i),map1.get(str.charAt(i))-1);
                        }
                        if(flag){
                            ans="Yes";
                            break;
                        }
                        num+=8;
                    }
                    System.out.println(ans);
                }
                
                
		
	}
       
}
  
class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
 
		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
	}
