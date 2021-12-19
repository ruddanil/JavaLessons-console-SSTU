package ru.rud.weapon;

public class Gun extends Weapon {
    private int ammo;
    private int maxAmmo;

    public Gun(int ammo) {
        super(ammo);
    }

    public Gun(int ammo, int maxAmmo){
        this(ammo);
        if(ammo > maxAmmo)
            this.ammo = maxAmmo;
        this.maxAmmo = maxAmmo;
    }

    public Gun() {
        ammo = 5;
        maxAmmo = ammo;
    }

    public void shoot() {
        if (ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        } else
            System.out.println("Клац!");
    }

    public int load(int ammo) {
        int tmpAmmo = 0;
        if (ammo < 0) throw new IllegalArgumentException("Количество патрон должно быть положительным");
        this.ammo = +ammo;
        if (this.ammo > maxAmmo) {
            tmpAmmo = ammo - this.ammo;
            this.ammo = maxAmmo;
            return tmpAmmo;
        }
        return 0;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isLoaded() {
        if (ammo > 0) return true;
        else return false;
    }

    public int unload() {
        int tmpAmmo = ammo;
        ammo = 0;
        return tmpAmmo;
    }


}
