package Qwerty;

import java.sql.Date;

public class Carrr {
    private String number;
    private String color;
    private Date production;
    private Owner owner;
        public Carrr(String number, String color, Date production) {
            this.number = number;
            this.color = color;
            this.production = production;
            this.owner = null;
        }

        public Carrr(String number, String color, Date production, Owner owner) {
            this.number = number;
            this.color = color;
            this.production = production;
            this.owner = owner;
        }

        public Carrr(String number) {
            this(number,"Black", new Date(System.currentTimeMillis()));
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Date getProduction() {
            return production;
        }

        public void setProduction(Date production) {

            this.production = production;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }
    }