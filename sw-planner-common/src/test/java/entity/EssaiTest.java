package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EssaiTest {

    @Test
    public void essaitest(){
        Essai essai = new Essai();
        essai.essai = "essai";
        assertEquals("essai", essai.essai);
    }

    @Test
    public void failed(){
        fail();
    }
}