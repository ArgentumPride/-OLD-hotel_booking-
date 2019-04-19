package ua.pride.models;

public enum Extra {
    cleaning {
        private int cost = 50;

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    },
    breakfast {
        public int cost = 70;
    }
}
