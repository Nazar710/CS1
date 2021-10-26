class CheckAllSmaller {
    public static int checkAllSmaller(int[] arr) {
        // Variable to count the elements that satisfy the condition
        int counter = 0;

        // Flag to mark an element on the right which does not satisfy the property
        boolean isGood = true;

        // Loop for each element of the array
        for(int i=0; i<arr.length; i++) {
            isGood = true;  // Initiallized to true

            // Check all the subsequent elements
            for(int j=i+1; j<arr.length && isGood; j++) {
                if(arr[i]>arr[j])   // If we find a larger element, the flag becomes false 
                    isGood = false;
            }

            if(isGood) counter++;
        }

        return counter;
    }
    public static void main(String[] args) {
        int[] A = {5,3,7,6,8,6,9};  // 4 (3,6,6,9)
        int[] B = {6,7,4,3,2};      // 1 (2)

        System.out.println(checkAllSmaller(A));
        System.out.println(checkAllSmaller(B));        
    }
}