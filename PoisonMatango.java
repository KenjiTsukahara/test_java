public classd PoisonMatango extends Matango{
		
		char type;
		private int PoisonMath = 5;
		int damage;
		
		public PoisonMatang(char a){
			
			super(a);
		}

		public Poison(Hero h){
			System.out.println("毒攻撃をした");
			h.setHp(h.getHp() - 10);
			this.PoisonMath--;
		}

		public attack(Hero h){
			
			super.attack();
			if(PoisonMath > 0){
				System.out.println("毒の胞子をばらまいた");
				
				this.damage = h.getHp/5;
		
				h.setHp(h.getHp - this.damage);

				System.out.println(this.damage+"のダメージ");
				this.PoisonMath--;
			}
		}

}
