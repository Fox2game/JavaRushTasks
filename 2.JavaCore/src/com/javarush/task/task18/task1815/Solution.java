package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public class TableInterfaceWrapper implements ATableInterface{

        private ATableInterface data;

        public TableInterfaceWrapper(ATableInterface data) {
            this.data = data;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            data.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return data.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
             data.setHeaderText(newHeaderText);
        }
    }
}