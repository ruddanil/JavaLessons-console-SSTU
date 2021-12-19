package ru.rud.trafficlight;

public enum Color {
    RED {
        public String getColour() {
            return "red";
        }

        public Color next() {
            return YELLOW;
        }
    },
    YELLOW {
        public String getColour() {
            return "yellow";
        }

        public Color next() {
            return GREEN;
        }
    },
    GREEN {
        public String getColour() {
            return "green";
        }

        public Color next() {
            return RED;
        }
    },
    BLACK {
        public String getColour() {
            return "black";
        }

        public Color next() {
            return YEllOWBLACK;
        }
    },
    YEllOWBLACK {
        public String getColour() {
            return "yellow";
        }

        public Color next() {
            return BLACK;
        }
    },
    BLACKBLACK {
        public String getColour() {
            return "black";
        }

        public Color next() {
            return BLACKBLACK;
        }
    };
    public abstract String getColour();
    public abstract Color next();
}
