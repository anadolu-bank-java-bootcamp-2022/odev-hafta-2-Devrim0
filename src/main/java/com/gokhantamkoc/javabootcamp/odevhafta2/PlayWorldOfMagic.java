package com.gokhantamkoc.javabootcamp.odevhafta2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayWorldOfMagic implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(PlayWorldOfMagic.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int maxNumOfAttacksAllowed = 9;
		String[] magicianSpells = createSpellNameRepository();
		float[] spellDamageInfo = createSpellDamageRepository();
		String[] bossNames = createBossNameRepository();
		float[] bossHps = createBossHPRepository();
		
		int minNumberSpellsUsed = resolveBattle(
				magicianSpells, 
				spellDamageInfo, 
				bossNames, 
				bossHps);
		
		if (minNumberSpellsUsed > maxNumOfAttacksAllowed) {
			System.out.println("Magician died!");
		} else if (minNumberSpellsUsed > 0 && minNumberSpellsUsed <= maxNumOfAttacksAllowed) {
			System.out.println("Magician won the battle!");
		} else {
			System.out.println("Result is not correct!");
		}
	}
	
	public static int resolveBattle(
			String[] magicianSpells,
			float[] spellDamageInfo,
			String[] bossNames,
			float[] bossHPs
			) {
		
		int spellsUsed = 0;
		// ______ BASLANGIC _______ Kodunuz buradan baslamali

		float MaxSpell=0; //  Büyü dizisinde maksimum büyü seçmek için tanımladım.
                
		for(int i=0;i<spellDamageInfo.length;i++){
		   if(spellDamageInfo[i]>MaxSpell){
		   MaxSpell=spellDamageInfo[i];  // "Ice Storm" seçilir
		   }
		}
		
		for(float i : bossHPs) {

			
		    while(i>0){ // canavar gücü 0 dan büyükse büyü yap ve 
				spellsUsed++;  //büyü kullanımını 1 arttır.
				i=i-MaxSpell;
			}
			 // 1.adım [-15.0, 05.0f, 20.0f] 1. 2. 3. büyü, 2.adım [-15.0f, -45.0f, -20.0f]  4. 5. 6. büyü // - olması tüm canavarlan yenilmiştir.
			//spellsUsed+=1;// +1 nedeni bir seferde üç büyü kullanıyor ve iki adımda 6 büyü kullanrak  tüm canavarları yeniyor...
			
		}
		
        System.out.println(spellsUsed);

		// ______ SON _______ Kodunuz burada bitmeli
		/* NOT: ______ BASLANGIC _______ ve ______ SON _______ 
		 * arasina istediginiz kadar sayida satir ekleyebilirsiniz.
		 */
		return spellsUsed;
	}
	
	public static String[] createSpellNameRepository() {
		return new String[]{"Ice Storm", "Chain Lightning", "Magic Missile"};
	}
	
	public static float[] createSpellDamageRepository() {
		return new float[]{40.0f, 30.0f, 5.0f};
	}
	
	public static String[] createBossNameRepository() {
		return new String[]{"Dire Rat", "Skeleton Knight", "Undead King"};
	}
	
	public static float[] createBossHPRepository() {
		return new float[]{15.0f, 45.0f, 60.0f};
	}
}
