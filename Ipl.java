class Ipl
{
public static void main(String a[])
{
 String iplTeams[] = new String[8];
        iplTeams[0] = "RCB";
        iplTeams[1] = "CSK";
        iplTeams[2] = "MI";
 	iplTeams[3] = "DC";
	iplTeams[4] = "SRH";
	iplTeams[5] = "PBKS";
	iplTeams[6] = "RR";
	iplTeams[7] = "KKR";
 int iplTrophies[] = new int[8];
	iplTrophies[0] = 0;
	iplTrophies[1] = 3;
	iplTrophies[2] = 4;
	iplTrophies[3] = 0;
	iplTrophies[4] = 2;
	iplTrophies[5] = 0;
	iplTrophies[6] = 1;
	iplTrophies[7] = 3;
System.out.println("IPL teams!!!!\n");
for(int z=0; z< iplTeams.length ; z++)
{
System.out.println(iplTeams[z]);
}
}
}