package com.company;

  class Cat extends Animal {
        String name;
        int age;
        private final int maxRun=200;
        @Override
        void swim(int lenght){
            System.out.println("Cat cant swim ");
        }
        @Override
        public void run(int lenght){
            if (lenght< maxRun){
                System.out.println("Animal run"+lenght);
            } else {
                System.out.println("Cats cant run more than"+maxRun);
            }


        }

        public Cat(String murzik, int i){
            this.name=name;
            this.age=age;
        }






}

