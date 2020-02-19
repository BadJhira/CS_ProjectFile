package CS_202.W6;

import java.util.Scanner;
import java.util.ArrayList;

public class Zylabs_NamePermutations {

    // TODO: Write method to create and output all permutations of the list of names.
    public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        if (nameList.isEmpty()) {
            for (int i = 0; i < permList.size(); i++) {
                System.out.print(permList.get(i) + " ");
                if (i == permList.size() - 1)
                    System.out.println();
            }
        } else {
            for (int i = 0; i < nameList.size(); i++) {
                ArrayList<String> tempPerm = new ArrayList<>(permList);
                ArrayList<String> tempName = new ArrayList<>(nameList);

                tempPerm.add(nameList.get(i));
                tempName.remove(i);
                allPermutations(tempPerm, tempName);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> permList = new ArrayList<>();
        String name;

        // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
        name = scnr.next();
        while (!name.equals("-1")) {
            nameList.add(name);
            name = scnr.next();
        }
        allPermutations(permList, nameList);
    }
}

