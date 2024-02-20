// Input: s = “geeks quiz practice code” 
// Output: s = “code practice quiz geeks”

 static void reverse(char str[], int start, int end)
 {
   String str1=new String[str.length];
   for(int i=str.length-1;i>0;i--){
        str1=str1+str[i];
   }
 }
TWO POINTER

static void reverse(char str[], int start, int end)
{  
  int start=0;
  char temp;
  int end=str.length-1;
  while(start<end){
    temp=str[start];
    str[start]=str[end];
    str[end]=temp;
    start=start+1;
    end=end-1;
  }
  System.out.println(str);
}



Input: s = “geeks quiz practice code” 

Output: s="skeeg ziuq ecitcarp edoc"  

static void reverse(char str[], int start, int end)
{  
  for(int i=0;i<str.length;i++){
    int start=0;
    String temp=str[i];
    int end=temp.length()-1;
    String ans="";
    ans=ans+reverseword(temp,start,end);
      }
  System.out.println(ans);
}
static String reverseword(String str,int start,int end){
  char temp;
  while(start<end){
    temp=str[start];
    str[start]=str[end];
    str[end]=temp;
  }
  return str;
}



Input: s = “geeks quiz practice code” 

Output: s="skeeg ziuq ecitcarp edoc"  
Output: s="edoc ecitcarp ziuq skeeg"
Actual_Output: s="edoce citc arpziups keeg"

  
  
static void reverse(char str[], int start, int end){
  char ch1;
  while(start<end){
    ch1=str[start];
    str[start]=str[end];
    str[end]=ch1;
  }
  i=0;
  char temp;
  while(i<str.length){
    
    if (str[i]!=" "){
      temp=temp+str[i];
    }
  }
  String res="";
  for(int i=0;i<n;i++){
    String temp=str[i];
    int req_len=temp.length();
    int j=0;
  //  String res="";
    while(j<temp.length){
      res=res+temp[j]
        }
    res=res+" ";
  }
  return res;
}
 // now str is reversed

// (((LONGEST COMMON PREFIX)))
// Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
// Output: “gee”

public String longestCommonPrefix(String[] a){
        int size = a.length;
        Arrays.sort(a);
        int end = Math.min(a[0].length(), a[size-1].length());
        int i=0;
        while(i<end && a[0].charAt(i)==a[size-1].charAt(i)){
          i++;
        }
        String ans=a.substring(0,i);
        return ans;
}

// Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
// Output: 3
// Explanation: Minimum distance between the words “the” and “fox” is 3



static int shortestDistance(String[] s,String word1, String word2)
{
  int count=0;
  int i=0;
  if(s[i]==word1){
    while(s[i+1]!=word2 && i<s.length){
      count++;
    }
    if(s[i+1]==word2){
      return count;
    }
  }
}

static int shortestDistance(String[] s,
                    String word1, String word2)
{
    int d1 = -1, d2 = -1;
    int ans = Integer.MAX_VALUE;
 
    // Traverse the string
    for (int i = 0; i < s.length; i++) {
        if (s[i] == word1)
            d1 = i;
        if (s[i] == word2)
            d2 = i;
        if (d1 != -1 && d2 != -1)
            ans = Math.min(ans, Math.abs(d1 - d2));
    }
 
    // Return the answer
    return ans;
}

maintain the first pointer for word1
maintain the first pointer for word2
if these pointers have a valid value ans=min(ans,pointer1-pointer2)

// First convert the given string to “a11” i.e. write, character along with its frequency.
// Then, change “a11” to “ab” because 11 is b in hexadecimal.
// Then, finally reverse the string i.e “ba”.




  // Function to encrypt the string
  static String encryptString(String S, int N)
  {
  int count=0;
  String ans="";
  char[] ch1=S.toCharArray();
  for(int i=0;i<ch1.length;i++){
    String ans=ans+ch1[i];
    
    while(ch1[i]==ch1[i+1] && i<c1.length){
      count=count+1;
    }
    ans=ans+count;
    if(ch1[i]!=ch1[i+1]){
      count=0;
      ans=ans+ch1[i+1];
      
      
    }

  }
  


    
    
      
  }
  
    
    

 
  
  
  
 
      
   


  
          
          

          
        
          
          
          
          
       
    
    
    
  

  
  
  
  
    
  
  
           

  
