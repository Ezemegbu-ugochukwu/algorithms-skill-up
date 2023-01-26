//package com.ugo;
//
//public class missingNumberCyclicSort {
//    public static void main(String[] args) {
//  int [] arr = {4,0,2,1};
//        System.out.println(missingNumber(arr));
//    }
//    public static int missingNumber(int [] arr){
//        int i = 0;
//        while (i < arr.length){
//         int correct = arr[i];
//         if (arr[i] < arr.length && arr[i] != arr[correct]){
//             swap(arr, i, correct);
//         }else {
//             i++;
//         }
//        }
//        for (int j = 0; j < arr.length; j++){
//            if (arr[j] != j){
//                return j;
//            }
//        }
//        return arr.length;
//    }
//     static void swap(int [] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second]  = temp;
//    }
//    public int numSplits(String s) {
//        int count=0,n=s.length();
//        int post[]=new int[n];
//        Set<Character>set=new HashSet<>();
//        for(int i=n-1;i>=0;i--){
//            set.add(s.charAt(i));
//            post[i]=set.size();
//        }
//        set=new HashSet<>();
//        for(int i=0;i<n-1;i++){
//            set.add(s.charAt(i));
//            if(set.size()==post[i+1])
//                count++;
//        }
//
//        return count;
//    }
//
//    List<String> result = list.stream().filter((e) -> e.startsWith("J")).toList();
//
//    list.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList()
//
//    public int solution(boolean[] P) {
//        int res = 0, prev = 0, count = 0, l = P.length;
//        for(int i=0; i<l; ++i)
//        {
//            if(P[i])
//            {
//                ++count;
//                res+=(i+1)*(l-i);
//                if(count>1)
//                {
//                    res-=(prev+1)*((l-(i-prev))-prev);
//                }
//                prev=i;
//            }
//        }
//        return (res<0||res>1000000000)?1000000000:res;
//    }
//}
//    public static int numSplits(String s) {
//        Map<Character, Integer> val1 = new HashMap<Character, Integer>();
//        Map<Character, Integer> val2 = new HashMap<Character, Integer>();
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            char c = s.charAt(i);
//            int count = val2.getOrDefault(c, 0) + 1;
//            val2.put(c, count);
//        }
//        int theSplits = 0;
//        for (int i = 0; i < length - 1; i++) {
//            char c = s.charAt(i);
//            int count1 = val1.getOrDefault(c, 0) + 1;
//            val1.put(c, count1);
//            int count2 = val2.get(c) - 1;
//            if (count2 > 0)
//                val2.put(c, count2);
//            else
//                val2.remove(c);
//            if (val1.size() == val2.size())
//                theSplits++;
//            else if (val1.size() > val2.size())
//                break;
//        }
//        return theSplits;
//
//    }
//}
//
