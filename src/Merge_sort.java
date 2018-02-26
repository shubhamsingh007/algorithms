import java.util.*;

public class Merge_sort {
	
	
		
		public void mergesort(int a[],int low,int high,int n)
		{
			int mid;
			if(low<high)
			{
				
				mid=(low+high)/2;
				mergesort(a,low,mid,n);
				mergesort(a,(mid+1),high,n);
				merge(a,low,mid,high,n);
			}
			
		}
		
		public void merge(int a[],int low,int mid,int high,int n)
		{
			int b[]=new int[n];
			int i=low;
			int j=(mid+1);
			int k=low;
			
			while((i<=mid)&&(j<=high))
			{
				if(a[i]<a[j])
				{
					b[k]=a[i];
					i++;
					k++;
				}
				else if(a[j]<a[i])
				{
					b[k]=a[j];
					j++;
					k++;
				}
			
			}
			
			if(i>mid)
			{
				for(int h=j;h<=high;h++)
				{	
				b[k]=a[h];
				k++;
				
				}
				}
			else if(j>high)
			{
				for(int h=i;h<=mid;h++)
				{
					b[k]=a[h];
				
				k++;
				}
			}
			
			for(int h=low;h<=high;h++)
			{
				a[h]=b[h];
			}
		}
		public static void main(String[] args) {
			Merge_sort mg= new Merge_sort();
			
			Scanner sc=new Scanner(System.in);
			float start = 0.0f;
			float end =0.0f;
			System.out.println("take value of n");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("chooice 1.best case 2.avg 3.worst case");
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1:System.out.println("best case");
					for(int i=0;i<n;i++)
					{
						a[i]=i;
						
					}
					break;
			case 2:System.out.println("avg case");
					Random ran=new Random();
					for(int i=0;i<n;i++)
					{
						a[i]=ran.nextInt();
					}
					break;
			case 3:	System.out.println("worst case");
					for(int i=0;i<n;i++)
					{
						a[i]=n-i;
					}
					break;
			}
			
			start =System.nanoTime();
					mg.mergesort(a,0,(n-1),n);
					end=System.nanoTime();
					/*System.out.println("array is");
					for(int i=0;i<n;i++)
					{
						System.out.print(" "+a[i]);
						
					}*/
					float time1=start;
					float time2=end;
					float time=end-start;
					System.out.println(" ");
					System.out.println("start= " + time1);
					System.out.println("end= "+ time2);
					System.out.println("time=");
					System.out.println(time);
					sc.close();
		}

	}



