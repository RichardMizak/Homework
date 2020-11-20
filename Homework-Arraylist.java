public class Arraylist {
    public static void main(String[] args) throws IOException {
        int count = 0;
        ArrayList<String> arr = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\names.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
                   count++;
            }
            ArrayList<Integer> newList = removeDuplicates(arr);
            System.out.println(newList);
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static <T> ArrayList<T> removeDuplicates(ArrayList<String> list)
    {
        ArrayList<T> newList = new ArrayList<T>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add((T) element);
            }
        }
        return newList;
    }
}
