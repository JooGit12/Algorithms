class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] realMap = new String[n];
        
        for (int i = 0; i < n; i++) {
            realMap[i] = createMapRow(n, arr1[i], arr2[i]);
        }
        
        return realMap;
    }

    private String toBinaryString(int n, int num) {
        return String.format("%" + n + "s", Integer.toBinaryString(num)).replace(' ', '0');
    }

    private String createMapRow(int n, int num1, int num2) {
        String binaryStr1 = toBinaryString(n, num1);
        String binaryStr2 = toBinaryString(n, num2);

        StringBuilder mapBuilder = new StringBuilder();
        for (int j = 0; j < n; j++) {
            if (binaryStr1.charAt(j) == '1' || binaryStr2.charAt(j) == '1') {
                mapBuilder.append('#');
            } else {
                mapBuilder.append(' ');
            }
        }
        return mapBuilder.toString();
    }
}
