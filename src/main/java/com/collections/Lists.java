package com.collections;

import java.util.List;

public class Lists {

    public static int indexOf(String str, List<String> colors) {
        int index = -1;
        int check = 0;

        for (int i = 0; i <= colors.size() - 1 & i !=index; i++) {
            if (colors.contains(str)) {
                if (str == colors.get(i) & index != check) {
                    index = i;
                    check = i;
                }

            }
        }

        return index;
    }


    public static int indexOfByIndex(String str, List<String> colors, int start) {

        int index = -1;
        int check = 0;

        for (int i = start; i <= colors.size() - 1 & i !=index; i++) {
            if (colors.contains(str)) {
                if (str == colors.get(i) & index != check) {
                    index = i;
                    check = i;
                }
            }
        }
        return index;
    }

    public static int indexOfEmpty(List<String> colors) {
        int index = -1;
        int check = 0;
        for (int i = 0; i <= colors.size() - 1 & check != index; i++) {
            if (colors.contains("")) {
                if (colors.get(i).isEmpty()){
                    index = i;
                    check = i;
                }
            }
        }
        return index;
    }

    public static int put(String str, List<String> colors) {
        int index = -1;
        int check = 0;
        for (int i = 0; i <= colors.size() - 1 & check !=index; i++) {
            if (colors.contains("")) {
                if ("" == colors.get(i)) {
                    index = i;
                    check = i;
                    colors.add(str);
                }
            }
        }
        return index;
    }

    public static int remove(String str, List<String> colors) {
        int cantidad = 0;

        for (int i = 0; i <= colors.size() - 1; i++) {
            if (colors.contains(str)) {
                if (str == colors.get(i)) {
                    colors.set(i, "");
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
}