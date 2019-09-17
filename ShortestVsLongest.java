package allStringMethods;
// 09/02/2019 :: i did not understand this program; confused assigning value 'shortest = ary[0]';
public class ShortestVsLongest {

	public static void main(String[] args) {
System.out.println("------- Using: Enhanched Loop[Especially made for Array]-----------------------");
		String str ="cow jumped over a the moon!";
		
		String[]ary =str.split(" ");
		String shortest = ary[0];//Assigning first/any element of an array;
		String longest = ary[0];// Assigning first/any element of an a array;
		
		for(String s1:ary) 
		{
			if(s1.length()<shortest.length())
			{
					shortest=s1;
			}
			else if(s1.length()>longest.length()) 
			{
					longest=s1;
			}
		}
		System.out.println("shortest word: "+shortest);
		System.out.println("longest word: "+longest);
		
System.out.println("------------------Using for Loop-----------------------");
		
	int arr[]= {12,21,11,10,3,99,66,32,8};
	int smallest, largest;
	smallest = arr[0]; //Assigning first/any element of an array;
	largest = arr[0]; // Assigning first/any element of an a array;
	 
	for(int i=0; i<arr.length; i++) 
	{
		if(arr[i]<smallest) 
		{
				smallest=arr[i];
		}
		else if(arr[i]>largest) 
		{
				largest=arr[i];
		}
	}
	System.out.println("shortest item in the Array: "+smallest);
	System.out.println("longest item in the Array: "+largest);
	
	}
	}






















/*
String s ="The cow jumped over the moon!";
		int a =0;
		String words;
		String shortestWord ="";		
		String[] ary = s.split(" ");
		
		for (int i=0; i< ary.length; i++) {
			
			if(ary[i].length()>a) {
				words=ary[i];	
				
			}
								
					for(int j=1; j<ary.length-1; j++) {
						
						if(ary[j].length()<ary[i].length()) {
							shortestWord=ary[j];
							
						}
												
					}
										
							}
		System.out.println("The Shortest word of the sentence is: "+"'"+shortestWord+"'");
		
*/