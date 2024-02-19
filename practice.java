(1. Find a peak element which is not smaller than its neighbours)

1. if the series is asc ::: last_elel
2. if the series is desc::: first_ele
3. if the series has same ele ::: no peeks 
4.  if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) then its a peak

( 2. find the minimum (or maximum) element of an array)

1. Arrays.sort(arr)
2. arr[0],arr[arr.length-1]

(3.  reverse array) 

1. two pointer 
2.  reversedArr[i] = arr[size - i - 1];
3. reverse loop 

(4. count no of occurance of a no in a array)
 //Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
 // Output: 4 // x (or 2) occurs 4 times in arr[]


for(int i=0;i<arr.length;i++){
         count=0;
       if (arr[i]==x){
               count=count+1;
}
}

(5. sort 0 1 2)

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

int start=0;
int mid=0;
int end=arr.length-1;
while(mid<arr.length){
       if(arr[mid]==0){
               swap(arr[low],arr[mid]);
               low=low+1;
               mid=mid+1;
               //break;
        }
        else if(arr[mid]==1){
               mid=mid+1;
              // break;
          }
        else(arr[mid]==2){
              swap(arr[mid],arr[end])
              mid=mid+1;
              end=end-1;
             // break;
         }
}
System.out.println(arr);
}

(6. Rotate array ) ( ALGORITHM)

1:  Rotate one by one

 {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }

2. Using temporary Array
3:  Juggling Algorithm
4. The Reversal Algorithm


(7. find missing n,o)
===> n(n+1)/2 -curr_sum


(8. count pairs with given sum)
Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

use two pointers 

int count=0;
int start=0;
int end=arr.length-1;
Arrays.sort(arr)
while(start<end){
    if(arr[start]+arr[end]==k){
           count++;
           start++;
           end--; 
     }
    else if(arr[start]+arr[end]<k){
            start++;
    }
    else{ 
           end++;
    }
}
System.out.println(count);
}

(9. FIND DUPLICATES IN ARRAY)
Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6

Arrays.sort(arr);
int res=new int[10];
for(int i=0;i<arr.length;i++){
      if(arr[i]==arr[i+1]){
            res=res+arr[i];
        }
}

for(int i=0;i<arr.length;i++){
     for(j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]){
                      res=res+arr[i];
                 }
  }
System.out.println(arr);
}



(10. find the common element in three sorted array)

// ar1[] = {1, 5, 10, 20, 40, 80} 
// ar2[] = {6, 7, 20, 80, 100} 
// ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
// Output: 20, 80

   // ar3[]
        int i = 0, j = 0, k = 0;
 
        // Iterate through three arrays while all arrays
        // have elements
        while (i < ar1.length && j < ar2.length
               && k < ar3.length) {
            // If x = y and y = z, print any of them and
            // move ahead in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }
 
            // x < y
            else if (ar1[i] < ar2[j])
                i++;
 
            // y < z
            else if (ar2[j] < ar3[k])
                j++;
 
            // We reach here when x > y and z < y, i.e

   // is smallest
            else
                k++;
        }
    }

(  Find the first repeating element)
input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 

Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
         if(arr[i]==arr[i+1]){
               return arr[i];
         }
}
if(i==arr.length){
     return -1;
}



(FIND FIRST NON REPEATING ELEMENT IN ARRAY)
Input: {9, 4, 9, 6, 7, 4}
Output: 6

Arrays.sort(arr)
for(int i=0;i<n;i++){
    if(arr[i]!=arr[i+1]){
          return i
     }
}
if(i==arr.length){
  return -1;
}


Map<Integer,Integer> mp=new Map<>();
for(int i=0;i<n;i++){
    if(map.containsKey(arr[i]){
           map.put(arr[i],map.get(arr[i])+1)
     }
     else{
           map.put(arr[i],1);
    }
}
 // Traverse array again and return
        // first element with count 1.
        for (int i = 0; i < n; i++)
            if (m.get(arr[i]) == 1)
                return arr[i];
        return -1;
    }


===>>>  (Count subarrays with equal number of 1’s and 0’s)


Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

=>>> The problem can be easily solved if O(n) extra space is allowed.
We can store the positive values and negative values in two separate data structures.
We will start filling the original array with alternating negative and positive values in the same order 
in which it appears in the original array.

>>> Once we find an out-of-place element, we find the first element after it with an opposite sign. We right rotate the subarray between these two elements (including these two).

First, sort the array in non-increasing order. Then we will count the number of positive and negative integers.
Then swap the one negative and one positive number in the odd positions till we reach our condition.
This will rearrange the array elements because we are sorting the array and accessing the element from left to right according to our need.


1. sort the array 
2. apply two pointer


(((  SUBARRAY WITH SUM 0   )))
Input: {4, 2, -3, 1, 6}
Output: true 
Explanation:
There is a subarray with zero sum from index 1 to 3.

Input: {4, 2, 0, 1, 6}
Output: true
#maintain a continuous array scan 
#keep on checking the sum

{
    for (int i = 0; i < n; i++) {
        int sum = arr[i];
        if (sum == 0)
            return true;
        for (int j = i + 1; j < n; j++) {
          
            sum += arr[j];
            if (sum == 0)
                return true;
        }
    }
    return false;
}
   
      
(((  Largest Sum Contiguous Subarray (Kadane’s Algorithm)  )))

[-2,-3,4,-1,-2,1,5,-3]=7 

int maxsum=-1000;
for(int i=0;i<n;i++){
     sum=arr[i];
     for(j=i+1;j<n;j++){
          sum=sum+arr[j];
          if(sum>maxsum){
                maxsum=sum;
           }
     }
}


{
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                                            = 0;
 
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    } 


ans=0
dp[0]=ar[0]
dp[i]=max(dp[i-1],dp[i-1]+a[i])
ans=Math.max(ans,dp[i])





 {
        // Initializing result
        int result = arr[0];
        int n = arr.length;
 
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++) {
                // updating result every time to keep an eye
                // over the maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        return result;



Use 3 variables, max_so_far, max_ending_here & min_ending_here
For every index, the maximum number ending at that index will be the maximum(arr[i], max_ending_here * arr[i], min_ending_here[i]*arr[i])
Similarly, the minimum number ending here will be the minimum of these 3
Thus we get the final value for the maximum product subarray



res=a[0]
dp[0]=ar[0]
for(int i=1;i<n;i++){
       if(a[i]!=0){
       dp[i]=dp[i-1]*Math.max(dp[i-1],dp[i-1]*a[i])
       }
       elif(a[i]==0){
            dp[i]=a[i]
       }
}
max_dp=max(dp)
res=Math.max(res,max_dp)
sopln(res)
}


((((   Longest Consecutive Subsequence    ))))

Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.


((((Longest Consecutive Subsequence)))


Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.


Arrays.sort(arr);
count=0;
max_count=-999;
for(int i=0;i<n;i++){
     if(arr[i+1]-arr[i]==1){
            count++;
      }
      else if(arr[i+1] - arr[i] == 0)
            {
                continue;
            }
            else
            {
                count = 1;
            }
            max_count = Math.max(max_count, count);
}
   
loop the arr
if cnsicutive :count++
if same ele: count=count
if not consecutive : count=1
max_count=max_count,count)




















        








        
            

             



              


