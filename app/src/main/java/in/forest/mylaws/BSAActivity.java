package in.forest.mylaws;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  BSAActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DataAdapter adapter;
    private ArrayList<DataModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnsactivity);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList = new ArrayList<>();


        dataList.add(new DataModel("Abetment", "109", "49", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "110", "50", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "111", "51", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "112", "52", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "113", "53", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "114", "54", "Same as for offence of abetted"));
        dataList.add(new DataModel("Abetment", "115", "55", "Imprisonment for 14 years when the act \n"+ "causes harm in consequence of abetment \n" +
                " and 7 years if the offence be not \n"+ "committed in consequence of the abetment" ));
        dataList.add(new DataModel("Abetment", "116", "56", "Imprisonment extending to one fourth or \n"+ "one half of the longest term provided \n" +
                "for the offence"));
        dataList.add(new DataModel("Abetment", "117", "57", "Imprisonment upto to 7 years"));
        dataList.add(new DataModel("Concealment", "118", "58(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Concealment", "118", "58(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Concealment", "119", "59(a)", "Imprisonment extending 1/2 of the longest term"));
        dataList.add(new DataModel("Concealment", "119", "59(b)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Concealment", "119", "59(c)", "Imprisonment extending to 1/4 of the \n"+ "longest term provided for the offence"));
        dataList.add(new DataModel("Concealment", "120", "60(a)", "Imprisonment extending to 1/4 of the \n"+ "longest term provided for the offence "));
        dataList.add(new DataModel("Concealment", "120", "60(b)", "Imprisonment extending two 1/8 of the \n"+ "longest term provided for the offence"));
        dataList.add(new DataModel("Criminal Conspiracy", "120(B)", "61(2)(a)", "Same as for abetment of the offence \n"+ "which is the object of conspiracy"));
        dataList.add(new DataModel("Criminal Conspiracy", "120(B)", "61(2)(b)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Attempt of offences", "511", "62", "1/2 of the Imprisonment for life or \n"+ "imprisonment not exceeding 1/2 of \n" +
                "longest term provided for the offence"));
        dataList.add(new DataModel("Rape", "376(1)", "64", "RI for not less than 10 years \n"+ "which may extend to imprisonment of life"));
        dataList.add(new DataModel("Rape", "376(2)", "64(2)", "RI for not less than 10 years\n"+ " which may extend to imprisonment of life"));
        dataList.add(new DataModel("Rape", "376(AB)", "65(1)", "RI for not less than 20 years \n"+ "which may extend to imprisonment of life"));
        dataList.add(new DataModel("Rape", "376(AB)", "65(2)", "RI for not less than 20 years \n"+ "which may extend to imprisonment of life"));
        dataList.add(new DataModel("Rape", "376(A)", "66", "RI for not less than 20 years \n"+ "which may extend to imprisonment of life"));
        dataList.add(new DataModel("Sexual intercourse", "376(B)", "67", "Imprisonment not less than 2 years \n"+ "but may extend to 7 years"));
        dataList.add(new DataModel("Sexual intercourse", "376(C)", "68", "RI not less than 5 years \n"+ "but may extend to 10 years"));
        dataList.add(new DataModel("Sexual intercourse new section", "No provision given", "69-Newly added provision", "Imprisonment which may extend 10 years"));
        dataList.add(new DataModel("Gang rape", "376D", "70(1)", "RI for not less than 20 years \n"+ "which may extend to imprisonment of life"));
        dataList.add(new DataModel("Gang rape", "376DA", "70(2)", "Imprisonment for life"));
        dataList.add(new DataModel("Gang rape", "376DB", "70(2)", "Imprisonment for life"));
        dataList.add(new DataModel("Rape(repeated offence)", "376E", "71", "Imprisonment for life"));
        dataList.add(new DataModel("Identity", "228A(1)/(2)", "72(1)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Identity", "228A(3)", "73", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Outraging modesty", "354", "74", "Imprisonment for 1 year \n"+ "which may extend to 5 years"));
        dataList.add(new DataModel("Sexual harassment", "354A", "75(2)", "RI for 3 years"));
        dataList.add(new DataModel("Sexual harassment", "354A", "75(3)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Disrobing", "354B", "76", "Imprisonment for not less than 3 years \n"+ "which may extend to 7 years"));
        dataList.add(new DataModel("Voyeurism", "354C", "77", "Imprisonment for not less than 1 year \n"+ "which may extend to 3 years and for \n" +
                "subsequent conviction imprisonment for not less than 3 years \n" +
                "which may extend to 7 years"));
        dataList.add(new DataModel("Stalking", "354D", "78(b)", "Imprisonment upto 3 years and \n"+ "for subsequent conviction upto 5 years"));
        dataList.add(new DataModel("Insulting the modesty", "509", "79", "Simple imprisonment for 3 years"));
        dataList.add(new DataModel("Dowry death", "304B", "80(2)", "Imprisonment for not less than 7 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Cohabitation", "493", "81", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Marriage", "494", "82(1)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Marriage", "495", "82(2)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Marriage", "496", "83", "Imprisonment upto 7 years"));
        dataList.add(new DataModel("Cruelty to women", "498", "84", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Cruelty to women", "498A", "85", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Kidnapping of women", "366", "87", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Miscarriage", "312", "88", "Imprisonment for 3 years and 7 years \n"+ "if the women be quick with child"));
        dataList.add(new DataModel("Miscarriage", "313", "89", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Miscarriage", "314", "90(1)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Miscarriage", "314", "90(2)", "Imprisonment for life"));
        dataList.add(new DataModel("Abortion", "315", "91", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Abortion", "316", "92", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Abandonment of child", "317", "93", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Concealment of birth", "318", "94", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Child trafficking", "No Provision", "95-New provision", "Imprisonment for not less than 3 years  \n" + "which may extend to 10 years"));
        dataList.add(new DataModel("Procuration of child", "366A", "96", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Kidnapping of child", "369", "97", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Selling minors", "372", "98", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Buying minors", "373", "99", "Imprisonment for not less than 7 years \n" + "which may extend to 14 years"));
        dataList.add(new DataModel("Murder", "302", "103(1)", "Death or imprisonment for life"));
        dataList.add(new DataModel("Murder by group of five or more persons", "No provision", "103(2)-New provision", "Death or imprisonment for life"));
        dataList.add(new DataModel("Murder", "303", "104", "Death or imprisonment for life"));
        dataList.add(new DataModel("Culpable homicide", "304", "105", "Imprisonment for life if death is caused with intention and \n" +
                "imprisonment for 10 years \n" + "if the death is caused without any intention"));
        dataList.add(new DataModel("Causing death by negligence", "304A", "106(1)", "Imprisonment for 5 years if death is caused by negligence \n" +
                "and imprisonment for 2 years for negligence \n"+ "by registered medical practitioner"));
        dataList.add(new DataModel("Causing death by rash and negligence driving", "304A", "106(2)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Abetment of suicide", "305", "107", "Death or imprisonment for life or 10 years"));
        dataList.add(new DataModel("Abetment of suicide", "306", "108", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Attempt to murder", "307", "109(1)", "Imprisonment for 10 years and, \n" + "if such an act causes hurt imprisonment for life"));
        dataList.add(new DataModel("Attempt to murder by life convict", "307", "109(2)", " Death or imprisonment for life"));
        dataList.add(new DataModel("Attempt to culpable homicide", "308", "110", "Imprisonment for 3 years,and 7 years if such an act causes hurt"));
        dataList.add(new DataModel("Organised crime", "No provision given", "111(2)(a)-Newly added provision", "Death or imprisonment for life"));
        dataList.add(new DataModel("organised crime", "No provision given", "111(2)(b)-Newly added provision", "Imprisonment for not less than 5 years which may \n" +
                "extend to imprisonment for life"));
        dataList.add(new DataModel("Abetment/Attempt/Conspiracy of organised crime", "No provision given", "111(3)-Newly added provision", "Imprisonment for not less than 5 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Member of organised crime syndicate", "No provision given", "111(4)-Newly added provision", "Imprisonment for not less than 5 years \n\"+ \" which may extend to imprisonment for life"));
        dataList.add(new DataModel("Harbouring or concealing any person committed organised crime", "No provision", "111(5)-Newly added provision", "Imprisonment for not less than 3 years \n\"+ \" which may extend to imprisonment for life"));
        dataList.add(new DataModel("Proceeds of organised crime", "No provision given", "111(6)-Newly added provision", "Imprisonment for not less than 3 years \n"+ " which may extend to imprisonment for life"));
        dataList.add(new DataModel("Proceeds of organised crime", "No provision given", "111(7)-Newly added provision", "Imprisonment for not less than 3 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Petty organised crime", "No provision given", "112-Newly added provision", "Imprisonment for not less than 1 year \n"+ " which may extend to 7 years"));
        dataList.add(new DataModel("Terrorist act", "No provision given", "113(2)(2)-Newly added provision", "Death or imprisonment for life"));
        dataList.add(new DataModel("Terrorist act", "No provision given", "113(2)(b)-Newly added provision", "Imprisonment for not less than 5 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Abetment/Attempt/Conspiracy of terrorist act", "No provision given", "113(3)-Newly added provision", "Imprisonment for not less than 5 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Organising camps, training for terrorist act", "No provision given", "113(4)-Newly added provision", "Imprisonment for not less than 5 years \n"+ " which may extend to imprisonment for life"));
        dataList.add(new DataModel("Member of terrorist organisation", "No provision given", "113(5)-Newly added provision", "Imprisonment for life"));
        dataList.add(new DataModel("Harbouring or concealing any person involved in terrorist act ", "No provision given", "113(6)-Newly added provision", "Imprisonment for not less than 3 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Proceeds of terrorist act", "No provision given", "113(7)-Newly added provision", "Imprisonment for life"));
        dataList.add(new DataModel("Hurt", "323", "115(2)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Grievous hurt", "325", "117(2)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Grievous hurt resulting into permanent disability or \n" + "persistent vegetative state", "No provision given", "117(3)-Newly added provision", "RI for not less than 10 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Grievous hurt caused by a group of five or more persons", "No provision given", "117(4)-Newly added provision", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Hurt by dangerous weapon or means", "324", "118(1)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Grievous hurt caused by dangerous weapon or means", "324", "118(2)", "Imprisonment for life or less than 1 year"));
        dataList.add(new DataModel("Hurt to extort property", "327", "119(1)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Grievous hurt to extort property", "No provision given", "119(2)-Newly added provision", "Imprisonment for life"));
        dataList.add(new DataModel("Hurt to extort confession", "330", "120(1)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Grievous hurt to extort confession", "330", "120(2)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Hurt to public servant", "332", "121(1)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Grievous hurt to public servant", "333", "121(2)", "Imprisonment not less than 1 year or for 10 years"));
        dataList.add(new DataModel("Hurt on provocation", "334", "122(1)", "Imprisonment for 1 month"));
        dataList.add(new DataModel("Grievous hurt on provocation", "335", "122(2)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Hurt by means of poison etc.", "338", "123", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Grievous hurt by use of acid", "326A", "124(1)", "Imprisonment for not less than 10 years \n"+ "which may extend to imprisonment for life"));
        dataList.add(new DataModel("Throwing or attempting to throw acid", "326B", "124(2)", "Imprisonment for 5 years \n"+ "which may extend to 10 years"));
        dataList.add(new DataModel("Act endangering life or personal safety", "336", "125", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Hurt by act endangering life or personal safety", "337", "125(a)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Grievous hurt by endangering life or personal safety", "338", "125(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Wrongful restraint", "341", "126(2)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("Wrongful confinement", "342", "127(2)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Wrongful confinement for three or more days", "343", "127(3)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Wrongful confinement for ten or more days", "344", "127(4)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Wrongful confinement when writ for liberation issued", "347", "127(5)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Wrongful confinement in secret", "346", "127(6)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Wrongful confinement to extort property", "3347", "127(7)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Wrongful confinement to extort confession", "348", "127(8)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Assault or use of criminal force", "352", "131", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Assault or use of criminal force to a public servant", "353", "132", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Assault or use of criminal force with intent to dishonour person", "355", "133", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Assault or use of criminal force to commit theft", "356", "134", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Assault or use of criminal force for wrongful confinement", "357", "135", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Assault or use of criminal force on grave and sudden provocation", "358", "136", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("Kidnapping", "363", "137(2)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Kidnapping a child for begging", "363A", "139(1)", "RI for not less than 10 years \n" + "which may extend to life"));
        dataList.add(new DataModel("Kidnapping or maiming minor for begging", "363A", "139(2)", "Imprisonment not less than 20 years"));
        dataList.add(new DataModel("Kidnapping for murder", "364", "140(1)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Kidnapping for ransom", "364A", "140(2)", "Death or imprisonment for life"));
        dataList.add(new DataModel("Kidnapping for subjecting a person to grievous hurt or slavery", "367", "140(4)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Importation of girl from foreign country", "366B", "141", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Wrongfully concealing or confining kidnapped person", "368", "142", "Punishment for kidnapping or abduction"));
        dataList.add(new DataModel("Trafficking of person", "378", "143(2)", "RI for not less than 7 years \n" + "which may extend to 10 years"));
        dataList.add(new DataModel("Trafficking of more than one person", "370", "143(3)", "RI for not less than 10 years \n" + "which may extend to life"));
        dataList.add(new DataModel("Trafficking of child", "370", "143(4)", "RI for not less than 10 years which may extend to life"));
        dataList.add(new DataModel("Trafficking of more than one child", "370", "143(5)", "RI for not less than 14 years which may extend to life"));
        dataList.add(new DataModel("Trafficking of child by convicted person", "370", "143(6)", "Imprisonment for life"));
        dataList.add(new DataModel("Trafficking by police or public servant", "370", "143(7)", "Imprisonment for life"));
        dataList.add(new DataModel("Exploitation of a trafficked child", "370A", "144(1)", "RI for not less than 5 years which may extend to 10 years"));
        dataList.add(new DataModel("Exploitation of a trafficked person", "370A", "144(2)", "RI for not less than 3 years which may extend to 7 years"));
        dataList.add(new DataModel("Habitual dealing in slaves", "370(1)", "145", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Unlawful compulsory labour", "374", "146", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Waging or attempting to wage war against government", "121", "147", "Death or imprisonment for life"));
        dataList.add(new DataModel("Conspiracy for waging or attempting \n" + "to wage war against government", "121A", "148", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Collecting arms etc. to wage war against government", "122", "149", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Concealing to facilitate design to wage war", "123", "150", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Assaulting President, Governor etc.", "124", "151", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Act endangering sovereignty, unity and integrity of India", "No provision given", "152-Newly added provision", "Imprisonment for life or for 7 years"));
        dataList.add(new DataModel("Waging war against any asiatic power in \n" + "alliance with government of India", "125", "153", "Imprisonment for life or for 7 years"));
        dataList.add(new DataModel("Committing depredation on the territories", "126", "154", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Receiving property taken by war", "127", "155", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Public servant allowing prisoner of state or war to escape", "128", "156", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Negligence of public servant in escaping of prisoner of state or war", "129", "157", "Simple imprisonment for 3 years"));
        dataList.add(new DataModel("Aiding escape or rescuing or harbouring such prisoner", "130", "158", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Abetting mutiny", "131", "159", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Abetment of mutiny, if committed in consequence thereof", "132", "160", "Death or imprisonment of life or for 10 years"));
        dataList.add(new DataModel("Abetment of assault by officer, soldier, sailor or airman", "133", "161", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Abetment of assault by officer, soldier, sailor, if assault committed", "134", "162", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Abetment of desertion of soldier, sailor or airman", "135", "163", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Harbouring deserter", "136", "164", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Deserter concealed on board, merchant vessel through negligence of master", "137", "165", "Fine of Rs. 3000/-"));
        dataList.add(new DataModel("Abetment of act of insubordination", "138", "166", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Wearing garb or carrying token used by soldier", "140", "168", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Bribery", "171E", "173", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Undue influence or personation at an election", "171F", "174", "Imprisonment for 1 year"));
        dataList.add(new DataModel("False statement in connection with election", "171G", "175", "Fine"));
        dataList.add(new DataModel("Illegal payments in connection with election", "171H", "176", "Fine of rs 10 thousands"));
        dataList.add(new DataModel("Failure to keep election account", "171I", "177", "Fine of rs 5 thousands"));
        dataList.add(new DataModel("Counterfeiting coin,government stamps,\n" + " currency note or bank note", "489A", "178", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Using as genuine forged or counterfeit coin, \n" + "government stamps, currency notes or bank notes", "489B", "179", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Possession of forged or counterfeit coin, \n" + "stamp, currency notes or bank notes", "489C", "180", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Making, buying, selling or possessing machinery, instruments\n" + " for counterfeiting coins, stamps, currency notes, bank notes", "489D", "181", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Making or using documents resembling currency notes or bank notes", "489E", "182(1)", "Fine of Rs 300/-"));
        dataList.add(new DataModel("Refusal for disclosing the name of printer \n" + "of forged currency notes or bank notes", "No provision given", "182(2)-Newly added provision", "Fine of Rs 600/-"));
        dataList.add(new DataModel("Effacing any writing from a substance \n" + "bearing a government stamp", "261", "183", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Using a government stamp used before", "262", "184", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Erasure of mark denoting that stamp has been used", "263", "185", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Fictitious a stamps", "263A", "186", "Fine of Rs. 200/-"));
        dataList.add(new DataModel("Person employed in a Mint causing \n" + "difference in weight or composition of once", "244", "187", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Unlawfully taking coining instrument from mint", "245", "188", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Being member of an unlawful assembly", "143", "189(2)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Joining or continuing in unlawful assembly", "145", "189(3)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Joining unlawful assembly armed with deadly weapon", "144", "189(4)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Knowingly joining or continuing in any assembly\n" + " when it has been commanded to disperse", "145", "189(5)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Hiring, engaging or employing persons \n" + "to take part in an unlawful assembly", "Provision not given", "189(6)-Newly added provision", "Same as sec. 189(2)"));
        dataList.add(new DataModel("Harbouring persons hired for an unlawful assembly", "Provision not given", "189(7)-Newly added provision", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Being hired to take part in an unlawful assembly", "Provision ont given ", "189(8)-Newly added provision", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Being hired to go armed to take part in an unlawful assembly ", "Provision not given", "189(9)-Newly added provision", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Common object of every member of unlawful assembly", "149", "190", "Same as for the offence"));
        dataList.add(new DataModel("Rioting", "147", "191(2)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Rioting, armed with deadly weapon", "148", "191(3)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Provocation to cause riot", "153", "192", "Imprisonment for 1 year, if not committed, Imprisonment for 6 months"));
        dataList.add(new DataModel("Liability of owner, occupier of land on \n" + "which an unlawful assembly or riot takes place", "154", "193(1)", "fine of Rs. 1000/-"));
        dataList.add(new DataModel("Liability of person whose benefit riot takes place", "155", "193(2)", "fine"));
        dataList.add(new DataModel("Liability of agent of owner or occupier for whose benefit riot takes place", "156", "193(3)", "Fine"));
        dataList.add(new DataModel("Affray", "159", "194(2)", "Imprisonment for 1 month"));
        dataList.add(new DataModel("Assaulting or obstructing public servant when suppressing riot", "152", "195(1)", "Imprisonment for 3 years or fine not less than Rs. 25000/-"));
        dataList.add(new DataModel("Threatening to assault or attempting \n" + "to obstruct public servant when suppressing riot", "152", "195(2)-Newly added provision", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Promoting enmity bet ween different groups ", "153A", "196(1)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Promoting enmity bet ween classes in place of worship", "153A", "196(2)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Imputations, assertions prejudicial to national integration", "153B", "197(1)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Imputations, assertions prejudicial to national integration \n" + "if committed in place of public worship", "Provision not given", "197(2)-Newly added Provision", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Public servant disobeying law", "166", "198", "Simple imprisonment for 1 year"));
        dataList.add(new DataModel("Public servant disobeying direction under law", "166A", "199", "RI for not less than 6 months which may extend to 2 years"));
        dataList.add(new DataModel("Non-treatment of victim by hospital", "166B", "200", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Public servant framing in correct document with intent to cause injury", "167", "201", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Public servant unlawfully engaging in trade", "168", "202", "Simple imprisonment for 1 year"));
        dataList.add(new DataModel("Public servant unlawfully buying or bidding for property", "169", "203", "Simple imprisonment for 2 years"));
        dataList.add(new DataModel("Personating a public servant", "170", "204", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Wearing garb or carrying token use by public servant", "171", "205", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Absconding to avoid to service of summons", "172", "206(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("Absconding to avoid service of summons \n" + "if it requires attendance in person", "172", "206(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Preventing service of summons", "173", "207(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("If summons require attendance in person", "173", "207(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Non-attendance in obedience to an order from public servant", "174", "208(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("If the order requires personal attendance in a court", "174", "208(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Non-appearance in response to a proclamation U/s 84 of BNNS", "174A", "209", "Imprisonment for 3 years and \n" + "when declaration made U/s 84(4) of BNNS then 7 years"));
        dataList.add(new DataModel("Omission to produce document or electronic record \n" + " to a public servant", "175", "210(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("If the document or electronic record is\n" + " to be produced in deliver to a court", "175", "210(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Omission to give notice or information to public servant", "176", "211(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("If the notice or information required \n" + "respects the commission of an offence", "176", "211(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("If notice or information required by an order U/s 394(1) of BNSS", "176", "211(c)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Knowingly furnishing false information to public servant", "177", "212(a)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("If the information required respects\n" + " the commission of an offence", "177", "212(b)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Refusing oath or affirmation", "178", "213", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Refusing to answer to public servant", "179", "214", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Refusing to sign statement made to a public servant", "180", "215", "Simple imprisonment for 3 months"));
        dataList.add(new DataModel("False statement on oath or affirmation", "181", "216", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Giving false information to a public servant", "182", "217", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Resistance to the taking of property by lawful authority", "183", "218", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Obstructing sale of property by authority of a public servant", "184", "219", "Imprisonment for 1 month"));
        dataList.add(new DataModel("Illegal purchase or bid for property offered for sale", "185", "220", "Imprisonment for 1 month"));
        dataList.add(new DataModel("Obstructing public servant in \n" + "discharge of public functions", "186", "221", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Omission to assist public servant", "187", "222(a)", "Simple imprisonment for 1 month"));
        dataList.add(new DataModel("Willfully neglecting to assist a public servant", "187", "222(b)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Disobedience to order of public servant", "188", "223(a)", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Disobedience to order of public servant\n" + " causing danger to human life, health or safety", "188", "223(b)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Threat of injury to public servant", "189", "224", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Threat of injury to induce person \n" + "to refrain from applying for protection", "190", "225", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Attempt to commit suicide to compel or \n" + "restraint exercise of lawful power", "Provision not given", "226-Newly added provision", "Imprisonment for 1 years"));
        dataList.add(new DataModel("Giving false or fabricating evidence", "193", "229(1)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Giving or fabricating false evidence in any other case", "193", "229(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Giving or fabricating false evidence for procuring conviction of capital offence", "194", "230(1)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("If innocent person be thereby convicted and executed", "194", "230(2)", "Death or as above"));
        dataList.add(new DataModel("Giving or fabricating false evidence for procuring conviction of imprisonment for life or for 7 years", "195", "231", "Same as for the offence"));
        dataList.add(new DataModel("Threatening any person to give false evidence", "195A", "232(1)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If innocent person convicted and sentenced", "195A", "232(2)", "Same as the offence"));
        dataList.add(new DataModel("using false or fabricated evidence in judicial proceeding", "196", "233", "Same as for giving or fabricating false evidence"));
        dataList.add(new DataModel("Issuing or signing false certificated", "197", "234", "Same as for giving or fabricating false evidence"));
        dataList.add(new DataModel("Using as true a certificate known to be false", "198", "235", "Same as for giving or fabricating false evidence"));
        dataList.add(new DataModel("False statement made in declaration", "199", "236", "Same as for giving or fabricating false evidence"));
        dataList.add(new DataModel("Using as true such declaration known to be false", "200", "237", "Same as for giving or fabricating false evidence"));
        dataList.add(new DataModel("Causing disappearance of evidence of offence if a capital offence", "201", "238(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Causing disappearance of evidence of offence if offence is for life imprisonment or for 10 years", "201", "238(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Causing disappearance of evidence of offence if offence is for less than 10 years", "201", "238(c)", "Imprisonment for 1/4 of the longest term"));
        dataList.add(new DataModel("Intentional omission to give information of offence", "202", "239", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Giving false information of an offence", "203", "240", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Destruction of document or electronic record", "204", "241", "Imprisonment for 3 years"));
        dataList.add(new DataModel("False personation for purpose of act or proceeding in suit", "205", "242", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Fraudulent removal or concealment of property", "206", "243", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Fraudulent clam to property to prevent its seizure", "207", "244", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Fraudulently suffering a decree to pass for a sum", "208", "245", "Imprisonment for 2 years"));
        dataList.add(new DataModel("False claim in court", "209", "246", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Fraudulently obtaining decree for sum not due", "210", "247", "Imprisonment for 2 years"));
        dataList.add(new DataModel("False charge of offence", "211", "248(a)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Criminal proceeding on a false charge for an offence punishable with death, imprisonment of life or for 10 years", "211", "248(b)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Harbouring an offender, if offence punishable with death", "212", "249(a)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("If punishable with imprisonment for life or for 10 years", "212", "249(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If punishable with imprisonment for one year and not for 10 years", "212", "249(c)", "Imprisonment for 1/4 of the longest term"));
        dataList.add(new DataModel("Taking gift, etc. to screen an offender if offence is punishable with death", "213", "250(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If punishable with imprisonment for life or for 10 years", "213", "250(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If punishable with imprisonment for less than 10 years", "213", "250(c)", "Imprisonment for 1/4 of the longest term"));
        dataList.add(new DataModel("Offering gift or restoration of property in consideration if offence punishable with death", "214", "251(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If punishable with imprisonment for life or for 10 years", "214", "251(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If punishable with imprisonment for less than 10 years", "214 ", "251(c)", "Imprisonment for 1/7 of the longest term"));
        dataList.add(new DataModel("Taking gift to help to recover stolen property", "215", "252", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Harbouring an offender escaped from custody, if offence punishable with death", "216", "253(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If punishable with imprisonment for life or for 10 years", "216", "253(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If punishable with imprisonment for less than 10 years", "216", "253(c)", "Imprisonment for 1/4 of the longest term"));
        dataList.add(new DataModel(" Harbouring robbers or dacoits", "216 A", "254", "RI for 7 years"));
        dataList.add(new DataModel(" Public servant disobeying direction on law to save a person from punishment or property from forfeiture", "217", "255", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Public servant framing an incorrect record to save person from punishment or property from forfeiture", "218", "256", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Public servant in a judicial proceeding corruptly making report", "219", "257", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Commitment for trial or confinement by a person having authority, who knows that he is acting contrary to law", "220", "258", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Intentional omission to apprehend by public servant if offence punishable with death", "221", "259(a)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If punishable with imprisonment for life or for 10 years", "221", "259(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If punishable with imprisonment for less than 10 years", "221", "259(c)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Intentional omission to apprehend by public servant under sentence or lawfully committed, if sentenced with death ", "222", "260(a)", "Imprisonment for life or for 14 years"));
        dataList.add(new DataModel("If under sentence of imprisonment for life or 10 years", "222", "260(b)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If under sentence of imprisonment of less than 10 years", "222", "260(c)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Escape from confinement negligently suffered by a public servant", "223", "261", "Simple imprisonment for 2 years"));
        dataList.add(new DataModel("Resistance or obstruction by a person to his lawful apprehension", "224", "262", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Resistance or obstruction to the lawful apprehension of any person", "225", "263(a)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("If charge with offence punishable with imprisonment for life or 10 years", "225", "263(b)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("If charge with offence punishable with imprisonment for death", "225", "263(c)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If sentenced with imprisonment for life or 10 years", "225", "263(d)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("If under sentence of death", "225", "263(e)", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Omission to apprehend or sufferance of escape on part of public servant, in cases not otherwise provided", "225(a)", "264", "Imprisonment for 3 years in case for intentional omission or sufferance, b Simple imprisonment for 2 years in case of negligence"));
        dataList.add(new DataModel("Resistance or obstruction to lawful apprehension or escape or rescue in cases not otherwise provided", "225(b)", "265", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Violation of condition of remission of punishment", "227", "266", "Punishment of original sentence of residual part"));
        dataList.add(new DataModel("Intentional insult or interruption to a public servant sitting in any stage of judicial proceeding", "228", "267", "Simple imprisonment for 6 months"));
        dataList.add(new DataModel("Personation of an assessor", "229", "268", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Failure by person released on bond or bail bond to appear in court", "229A", "269", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Negligent at likely to spread infection of disease dangerous to life", "269", "270", "Imprisonment for 6 month"));
        dataList.add(new DataModel("Malignant act likely to spread infection of disease dangerous to life", "270", "272", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Knowingly this obeying any quarantine rule", "271", "273", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Adulteration of food or drink", "272", "274", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Sale of noxious food or drink", "273", "275", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Adulteration of drugs", "274", "276", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Sale of adulterated drugs", "275", "277", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Sale of Drug as a different drug or preparation", "276", "278", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Fouling water of public spring reservoir", "277", "279", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Making atmosphere noxious to health", "278", "280", "Fine of Rs. 1000/-"));
        dataList.add(new DataModel("Rash driving or riding on a public way", "279", "281", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Rash navigation of vessel", "280", "282", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Exhibition of a false light, mark or buoy", "281", "283", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Conveying person by water for hire in unsafe or overloaded vessel", "282", "284", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Causing danger or obstruction in public way or line of navigation", "283", "285", "Fine of Rs. 5000/-"));
        dataList.add(new DataModel("Negligent conduct with respect to poisonous substance", "284", "286", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Negligent conduct with respect to fire or combustible matter", "285", "287", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Negligent conduct with respect to explosive substance", "286", "288", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Negligent conduct with respect to machinery", "287", "289", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Negligent conduct with respect to polling down, repairing or constructing buildings ect.", "288", "290", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Negligent conduct with respect to animal", "289", "291", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Committing public nuisance in cases not otherwise provided", "290", "292", "Fine of Rs. 1000/-"));
        dataList.add(new DataModel("Continuance of nuisance after injunction to this continue", "291", "293", "Simple Imprisonment for 6 months"));
        dataList.add(new DataModel("Sale, etc. of obscene books etc.", "292", "294(2)", "First conviction with Imprisonment for 2 years and on subsequent conviction with imprisonment for 5 years"));
        dataList.add(new DataModel("Sale, etc. of obscene objects to child", "293", "295", "First conviction with Imprisonment for 3 years and on subsequent conviction with imprisonment for 7 years"));
        dataList.add(new DataModel("Obscene acts and songs", "294", "296", "Imprisonment for 3 months"));
        dataList.add(new DataModel("Keeping a Lottery office", "294A", "297(1)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Publishing proposals relating to lotteries", "294A", "297(2)", "Fine of Rs. 5000/-"));
        dataList.add(new DataModel("Defiling, etc. place of worship with intent to insult the religion of any class", "298", "298", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Deliberate and malicious acts intended to outrage religious feelings", "295A", "299", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Disturbing religious assembly", "296", "300", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Trespassing on burial places etc.", "297", "301", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Uttering words, etc., with deliberate intent to wound religious feelings", "298", "302", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Theft", "379", "303(2)", "RI for not less than 1 year, which may extend to 5 years"));
        dataList.add(new DataModel("Theft, where value of the property is less than rs. 5,000/-", "379", "303(2)- Newly added provision", "Upon return of the value or restoration of stolen property, shall be punished with community service"));
        dataList.add(new DataModel("Snatching", "Provision not given", "304(2)-Newly added provision", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Theft in a dwelling house, or means on transportation or place or worship", "380", "305", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Theft by a clerk or servant", "381", "306", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Theft after preparation made for causing death, hurt or restraint", "382", "307", "RI for 10 years"));
        dataList.add(new DataModel("Extortion", "384", "308(2)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Extortion by putting or attempting to put in fear of injury ", "385", "308(3)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Extortion by putting a person in fear of death or grievous heart", "386", "308(5)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Putting a person in fear of accusation of an offence punishable with death, imprisonment of life or for 10 years ", "389", "308(6)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Extortion by putting a person in fear of accusation of an offence punishable with death, imprisonment of life or for 10 years", "388", "308(7)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Robbery", "392", "309(4)", "RI for 10 years"));
        dataList.add(new DataModel("Robbery committed on highway bet ween sunset and sunrise", "392", "309(4)", "RI for 14 years"));
        dataList.add(new DataModel("Attempt to commit robbery", "393", "309(5)", "RI for 7 years"));
        dataList.add(new DataModel("Robbery with causing heart", "394", "309(6)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Dacoity", "395", "310(2)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Murder in dacoity", "396", "310(3)", "Death, imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Making preparation to commit dacoity", "399", "310(4)", "RI for 10 years"));
        dataList.add(new DataModel("Being a member of five or more persons assembled to commit dacoity", "402", "310(5)", "RI for 7 years"));
        dataList.add(new DataModel("Belonging to a gang of persons habitually committing dacoity", "400", "310(6)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Robbery or dacoity with attempt to calls death or grievous", "397", "311", "Imprisonment for not less than 7 years"));
        dataList.add(new DataModel("Attempt to commit robbery or dacoity when armed with deadly weapon", "398", "312", "Imprisonment for not less than 7 years"));
        dataList.add(new DataModel("Belonging to a wandering gang of persons habitually committing theft", "401", "313", "RI for 7 years"));
        dataList.add(new DataModel("Dishonest misappropriation of movable property", "403", "314", "Imprisonment or not less than 6 months which may extend to 2 years"));
        dataList.add(new DataModel("Dishonest misappropriation of property possessed by deceased person", "404", "315", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Dishonest misappropriation of property if by clerk or employee", "404", "315", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Criminal breach of trust", "406", "316(2)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Criminal breach of trust by a carrier, wharfinger", "407", "316(3)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Criminal breach of trust by a clerk or servant ", "408", "316(4)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Criminal breach of trust by public servant or banker, merchant or agent etc.", "409", "316(5)", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Dishonestly receiving stolen property", "411", "317(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Dishonestly receiving stolen property knowing it to be obtained by dacoity", "412", "317(3)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("Habitually deling in stolen property", "413", "317(4)", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Assisting in concealment or disposal of stolen property", "414", "317(5)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Cheating", "417", "318(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Cheating a person whose interest the offender was bound", "418", "318(3)", "Imprisonment for 5 years"));

        dataList.add(new DataModel("Cheating and dishonestly inducing delivery of property", "420", "318(4)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Cheating by personation", "419", "319(2)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Fraudulent removal or concealment of property etc., to prevent distribution among creditors", "421", "320", "Imprisonment for not less than 6 months which may extend upto 2 years"));
        dataList.add(new DataModel("Dishonest or fraudulently preventing from being made available for his creditors a debt of demand due to the offender", "422", "321", "Imprisonment for 2 years"));







        dataList.add(new DataModel("Dishonest or fraudulent execution of deed of transfer containing a false statement of consideration ", "423", "322", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Dishonest or fraudulent removal or concealment of property", "424", "323", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Mischief", "426", "324(2)", "Imprisonment for 6 months"));
        dataList.add(new DataModel("Mischief causing loss or damage to any property including government property", "425", "324(3)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Mischief causing loss or damage to the amount of 20000 rupees, but less than two lakh rupees", "427", "324(4)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Mischief causing loss or damage to the amount of one lakh rupees or upwards", "427", "324(5)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief with preparation for causing to any person's death or hurt or wrongful restraint", "Not provided", "Newly added provision", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief by killing maming animal", "429", "325", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief by causing dimiunition of supply of water for agricultural purpose", "430", "326(a)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief by injury to public road, bridge,navigable water or channel etc.,", "431", "326(b)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief by causing innundation or obstruction to public drainage ", "432", "326(c)", "Imprisonment for 5 years"));
        dataList.add(new DataModel("Mischief by destroying or moving or rendering less useful lighthouse or sea mark", "433", "326(d)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Mischief by destroying or moving a landmark fixed by public authority", "434", "326(e)", "Imprisonment for 1 years"));
        dataList.add(new DataModel("Mischief by fire or explosive substance with intent to cause damage", "435", "326(f)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Mischief by fire or explosive substance with intent to destroy a house", "436", "326(g)", "Imprisonment for life or for 10 years"));
        dataList.add(new DataModel("Mischief with intent to destroy or make unsafe a decked vessel or a vessel of 20 tons burden", "437", "327(1)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Mischief described in Section 327(1) when committed by fire or any explosive substance", "438", "327(2)", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Running vessel with intent to commit theft", "439", "328", "Imprisonment for 10 years"));

        dataList.add(new DataModel("Criminal trespass", "448", "329(4)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Lurking house trespass or house breaking", "453", "331(1)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Lurking house trespass or house breaking by night", "456", "331(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Lurking house trespass or house breaking in order to the commission of an offence punishable with imprisonment", "454", "331(3)", "Imprisonment for 3 years, if the offence with theft then imprisonment for 10 years"));




        dataList.add(new DataModel("Lurking house trespass or house breaking by night inorder to the commission of an offence punishable with imprisonment ", "457", "331(4)", "Imprisonment for 10 years, if the offence be theft then imprisonment for 14 years"));
        dataList.add(new DataModel("Lurking house trespass or house  breaking after preparation meant for causing hurt or assault etc.,", "455", "331(5)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("Lurking house trespass by night after preparation meant for causing hurt", "458", "331(6)", "Imprisonment for 14 years"));
        dataList.add(new DataModel("Grevious hurt caused whilst committing lurking house trespass or house breaking", "459", "331(7)", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Death or grevious hurt caused by one of several persons jointly concerned in house breaking by night", "460", "331(8)", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("House trespass in order to the commission of an offence punishable with death", "449", "332(a)", "Imprisonment for life or RI for 10 years"));
        dataList.add(new DataModel("House trespass in order to the commission of an offence punishable with imprisonment for life", "450", "332(b)", "Imprisonment for 10 years"));
        dataList.add(new DataModel("House trespass in order to the commission of an offence punishable with imprisonment", "451", "332(c)", "Imprisonment for 2 years, if the offence is theft imprisonment for 7 years"));
        dataList.add(new DataModel("House trespass having made preparation for causing hurt, assault etc.,", "452", "333", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Dishonestly breaking open or unfastening any closed receptacle", "461", "334(1)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Fraudulently opening any closed receptacle containing property given on entrustment ", "462", "334(c)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Forgery", "465", "336(2)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Forgery for the purpose of cheating", "468", "336(3)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Forgery for the purpose of harming the reputation of any person", "469", "336(4)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Forgery of a record of a court or of a registrar of birth etc.,", "466", "337", "Imprisonment for life or for 7 years"));
        dataList.add(new DataModel("Forgery of a valuable security, will, or authority to make or transfer any valuable security or to receive any money", "467", "338", "Imprisonment for life or 10 years"));
        dataList.add(new DataModel("Having possession of a document knowing it to be forged with intent to use it as genuine", "474", "339", "Imprisonment for 7 years and if the document is one of the descriptions mentioned in Section 338 imprisonment for life or for 7 years"));
        dataList.add(new DataModel("Using a genuine a forged document which is known to be forged", "471", "340(2)", "Imprisonment for life or 10 years"));

        dataList.add(new DataModel("Making or counterfeiting a seal, plate etc., with intent to commit forgery punishable under Section 338", "472", "341(1)", "Imprisonment for life or 7 years"));
        dataList.add(new DataModel("Making or counterfeiting a seal or plate etc., with intent to commit a forgery punishable otherwise than under Section 338", "473", "341(2)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Possession of any seal, plate or any other instrument knowing the same to be counterfeit", "Provision not given", "341(3)-Newly added provision", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Fraudulently or dishonestly using as genuine any seal, plate or other instruments knowing the same to be counterfeit", "Provision not given", "341(4)", "Imprisonment for life or 7 years"));





        dataList.add(new DataModel("Counterfeiting of a devise or mark used for authenticating documents described in Section 338", "475", "342(1)", "Imprisonment for life or 7 years"));
        dataList.add(new DataModel("Counterfeiting a devise or mark used for authenticating documents other than those described in Section 338,", "476", "342(2)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Fraudulently destroying or defacing or attempting to destroy or deface or secreting a will", "477", "343", "Imprisonment for life or 7 years"));
        dataList.add(new DataModel("Falsification of accounts", "477 A", "344", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Using false property mark with intent to deceive or injure any person", "482", "345(3)", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Removing, destroying or defacing property marks with intent to cause injury", "489", "346", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Counterfeiting a property mark used by another with intent to cause damage or injury", "483", "347(1)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Counterfeiting a property mark used by public servant or any mark used by him to denote the manufacture, quality etc., of any property", "484", "347(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Fraudulently making or having possession any die, plate or other instruments for counterfeiting any public or private property mark", "485", "348", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Knowingly selling goods marked with counterfeit property mark", "486", "349", "Imprisonment for 1 year"));
        dataList.add(new DataModel(" Fraudulently making a false mark upon any package or receptacle containing goods", "487", "351", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Making use of any such false marks", "488", "350(2)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("Criminal intimidation", "506", "351(2)", "Imprisonment for 2 years"));
        dataList.add(new DataModel("Criminal intimidation, if threat be to cause death or grevious hurt", "506", "351(3)", "Imprisonment for 7 years"));
        dataList.add(new DataModel("Criminal intimidation by anonymous communication or having taken precaution to conceal when the threat comes", "507", "351(4)", "Imprisonment for 2 years, in addition to the punishment under Section 351(1)"));
        dataList.add(new DataModel("Insult intended to provoke breach of peace", "504", "352", "Imprisonment for 2 years"));
        dataList.add(new DataModel("False statement, rumour etc., circulated with intent to cause mutiny or offence against the public peace", "505", "353(1)", "Imprisonment for 3 years"));
        dataList.add(new DataModel("False statement rumour etc., with intent to create enmity, hatred or ill will between different classes", "No provision given", "353(2)- Newly added provision", "Imprisonment for 3 years"));

        dataList.add(new DataModel("False statement, rumour etc., made in place of worship etc., with intent to create enmity, hatred or ill will", "No provision given", "353(3)- Newly added provision", "Imprisonment for life or 5 years"));
        dataList.add(new DataModel("Act caused by inducing a person to believe that he will be rendered an object of devine displeasure", "508", "354", "Imprisonment for 1 year"));
        dataList.add(new DataModel("Appearing in a public place in a state of intoxication and causing annoyance to any person", "510", "355", "Simple imprisonment for 24 Hours"));
        dataList.add(new DataModel("Defamation against the President or the Vice President or the Governor etc.,", "499", "356(2)", "Simple imprisonment for 2 years, defamation in any other case, then 2 years or community service"));

        dataList.add(new DataModel("Printing or engraving matter knowing it to be defamatory against the President or the Vice President of the Governor etc.,", "501", "356(3)- ", "Simple imprisonment for 2 years"));
        dataList.add(new DataModel("Sale of printed or engraved substance containing defamatory matter against the President, Vice President or GGovernor etc., ", "502", "356(4)", "Simple imprisonment for 2 years"));
        dataList.add(new DataModel("Breach of contract to attend on and supply wants of helpless person", "491", "357", "Imprisonment for 3 months"));




        adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);

        setupSearchView();
    }

    private void setupSearchView() {
        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.filter(newText);
                return true;
            }
        });
    }
}