package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson17.local;

public class Local {
    public Pair getPair() {
        class LocalPair implements Pair {
            private String name;
            private int data;

            private LocalPair(String name, int data) {
                this.name = name;
                this.data = data;
            }

            public String getName() {
                return name;
            }

            public int getData() {
                return data;
            }
        }

        return new LocalPair("UUU", 100);
    }

    public void handle(boolean param) {
        if (param) {
            class Task {
                private int parametr;

                public Task(int parametr) {
                    this.parametr = parametr;
                }

                public void waitingFor() {
                    System.out.println(parametr);
                }
            }
            new Task(100).waitingFor();
        } else {
        }
    }
}
