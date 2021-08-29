public class clean {                                    //clean-up class Name from  B to clean as public

        static class Min_Max {                          //Clean-up  class Name from  c to Min_Max

             int SmallNumber;                           // Replace variable Name from a  to SmallNumber
             int LargeNumber;                           // Replace variable Name from b  to LargeNumber
        }

         static Min_Max func1(int[] arr, int n) {       // clean-up code from arguments (int arr[],int n)
            Min_Max minMax = new Min_Max();             // static class clean.Min_Max  extends Object
            int i;

            if (n == 1) {                                   // compare number with integer value
                minMax.LargeNumber = arr[0];               // clean.Min_Max minMax = new clean.Min_Max() and clean.Min_Max int LargeNumber
                minMax.SmallNumber = arr[0];               // clean.Min_Max minMax = new clean.Min_Max() and   clean.Min_Max int SmallNumber
                return minMax;                                // return minimum/maximum number
            }

            if (arr[0] > arr[1]) {                              // compare number with given arrays values
                minMax.LargeNumber = arr[0];
                minMax.SmallNumber = arr[1];
            } else {
                minMax.LargeNumber = arr[1];
                minMax.SmallNumber = arr[0];
            }

            for (i = 2; i < n; i++) {                               // run loop from 2nd element of array to last element
                if (arr[i] > minMax.LargeNumber) {
                    minMax.LargeNumber = arr[i];
                } else if (arr[i] < minMax.SmallNumber) {
                    minMax.SmallNumber = arr[i];
                }
            }

            return minMax;                                          // return that number
        }

        public static void main(String[] args) {
            int[] arr = {1000, 11, 445, 1, 330, 3000};                         // taking input as arrays elements
            int s = 6;                                                         // total numbers of array elements
            Min_Max minMax = func1(arr, s);
            System.out.printf("\n MinimumNumber is %d", minMax.SmallNumber);   // print smallest number from given array as Output
            System.out.printf("\n MaximumNumber is %d", minMax.LargeNumber);    // print largest number from given array as Output
        }
    }

