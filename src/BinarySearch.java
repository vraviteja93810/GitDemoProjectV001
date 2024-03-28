
public class BinarySearch {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	//elements should be in sorting order.
	int key=80;
	int L=0;
	int H=a.length-1;
	boolean flag=false;
	while(L<=H)
	{
		int Mid=(L+H)/2;
		if(a[Mid]==key)
		{
			System.out.println("Element Found");
			flag=true;
			break;
		}
		
		if(key<a[Mid])
		{
			H=Mid-1;
			
		}
		if(key>a[Mid])
		{
			L=Mid+1;
			
		}
	}
	if(flag==false)
	{
		System.out.println("Element not found");
	}
}
}
