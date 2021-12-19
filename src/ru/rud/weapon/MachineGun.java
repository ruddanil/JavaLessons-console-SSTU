package ru.rud.weapon;

public class MachineGun extends Gun {
    private int fireRate;

    public MachineGun() {
        super(30);
        fireRate = 30;
    }

    public MachineGun(int ammo) {
        super(ammo);
        fireRate = ammo / 2;
    }

    public MachineGun(int ammo, int fireRate) {
        super(ammo);
        if (fireRate > 0) this.fireRate = fireRate;
        else throw new IllegalArgumentException("Скорострельность должна быть > 0");
    }

    public void shoot() {
        for (int i = 0; i < fireRate; i++) super.shoot();
    }

    public void shoot(int sec) {
        for (int i = 0; i < fireRate * sec; i++) super.shoot();
    }
}
