class ProgramTumpukanRinie
{
	static int atas = -1;
	static int batasAtas = 9;

	public static void push(String tumpukan[], String data)
	{
		if(atas >= batasAtas)
			System.out.println("Tumpukan penuh");
		else
			{
			System.out.println("PUSH : " + data);
			atas = atas + 1;
			tumpukan[atas] = data;
	}
}

public static String pop(String tumpukan[])
{
	String hasilPop = " ";
	if(atas < 0)
		hasilPop = "Tumpukan kosong";
	else
	{
		hasilPop = tumpukan[atas];
		tumpukan[atas] = null;
		atas--;
	}
	return (hasilPop);
}
public static void clear(String tumpukan[])
	{
		for(int i = batasAtas; i >= 0; i--)
		{
			if(i < 0)
				System.out.println("null");
			else
			{
				tumpukan[i] = null;
			}
		}
		atas = -1;
	}
	public static void bacaTumpukan(String tumpukan[])
	{

		System.out.println("Kondisi tumpukan : ");
		for (int i = batasAtas; i >= 0; i--)

		{
			if(i == atas)
				System.out.println(i + "." + tumpukan[i] + "atas");
			else
				System.out.println(i + "." + tumpukan[i]);
	}
}

public static void main(String args[])
{
	String tumpukan [] = new String[10];
	push(tumpukan, "Buku A");
	push(tumpukan, "Buku B");
	push(tumpukan, "Buku C");
	push(tumpukan, "Buku D");

	System.out.println();
	bacaTumpukan(tumpukan);

	System.out.println();
	push(tumpukan, "Buku E");
	push(tumpukan, "Buku F");
	push(tumpukan, "Buku G");
	System.out.println();
	bacaTumpukan(tumpukan);

	System.out.println();
	push(tumpukan, "Buku H");
	push(tumpukan, "Buku I");
	push(tumpukan, "Buku J");
	push(tumpukan, "Buku K");
	push(tumpukan, "Buku L");
	System.out.println();
	bacaTumpukan(tumpukan);

	System.out.println();
	System.out.println("POP : " + pop(tumpukan) );
	bacaTumpukan(tumpukan);

	System.out.println();
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	bacaTumpukan(tumpukan);

	System.out.println();
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));
	System.out.println("POP : " + pop(tumpukan));

	clear(tumpukan);
	bacaTumpukan(tumpukan);
	
	}
   }

	
