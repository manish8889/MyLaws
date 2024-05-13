package in.forest.mylaws;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BNSSActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DataAdapter1 adapter;
    private ArrayList<DataModel1> dataList;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnssactivity);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList = new ArrayList<>();

        // Add your DataModel1 objects here
        dataList.add(new DataModel1("Arrest","41","35","1. Police can make arrest without warrant in cognizable cases, \n" +
                "2. In non-cognizable cases, police cannot arrest a person without warrant or order from Magistrate\n" +
                "3. In cases attracting less than three years of imprisonment and the accused is infirm \n" +
                "or above 65 years of age prior permission of officer not below the rank of DSP is mandatory. \n" +
                "4. For more details refer to Section 35 of BNSS, \n" +
                "5. In case where the arrest of a person is not required under sub section (1), a notice directing the person to appear is to be issued"));
        dataList.add(new DataModel1("Duties of officer making arrest","41B","36","1. To bear clear identification of his name, \n" +
                "2. To prepare a memorandum of arrest\n" +
                "3. Information to be given to the relative or a friend or any other perosn named by the arrestee"));
        dataList.add(new DataModel1("Designated police officer","41C","37","1. Establishment of a police control room in a every district, \n" +
                "2. To designate a police officer not below the rank of ASI in every police station\n" +
                "3. To maintain the information about the person arrested \n" +
                "4. To display the details of every arrest in any manner including digital mode in every police station and at the district headquarter"));
        dataList.add(new DataModel1("Right of arrested person","41D","38","1. Entitlement of the arrestee to meet an advocate of his choice during interrogation"));
        dataList.add(new DataModel1("Arrest on refusal give name and residence","42","39","1. Police officer may arrest an accused of non cognizable offence if he refuses give his name and residence, \n" +
                "2. If the police officer as reason to believe that the name residence given is false,\n" +
                "3. The person shall be released on a bond when his true name and residence is as certained,\n" +
                "4. He will be forwarded to nearest magistrate if he is name and address is not as certained or he fails to furnished bond"));
        dataList.add(new DataModel1("Protection of members of arms forces from arrest","45","42","1. No member of arm force to be arrested  without obtaining the consent of the central government for any thing done by him in the discharge of his official duties"));
        dataList.add(new DataModel1("Arrest how made","46","43","1. To actually touch or confine the body of the person to be arrested, \n" +
                "2. No male police officer shall touch the body of a female arrestee. it can be done by a female police officer, \n" +
                "3. Handcuffing of an accused for producing him before the court may be done if he is a habitual or repeat offender, or who escaped from custody,\n" +
                "or who has committed offence of organised crime, terrorist act, drug related crime or illegal possession of arm and ammunition, murder, rape, acid attack,\n" +
                "counterfeiting of coin and currency notes, human trafficking, sexual offence against children or offence against state,\n" +
                "4. Save in exceptional circumstances, no women can be arrested after sun set and before sun rise,\n" +
                "5. In exceptional circumstances a women shall be arrested by the women police officer after obtaining the prior permission of the magistrate"));
        dataList.add(new DataModel1("Searc of place entered by person sought to be arrested","47","44","1. If ingress to such place cannot be obtained,\n" +
                "the police officer can break open any outer or inner door of window of any house or place\n" +
                "2. Giving notice to the female in the actual occupancy of an apartment (not being the person to be arrested) to have liberty to withdraw,\n" +
                "3. Police officer lawfully entered a house or place to arrest may break open any outer or inner door or window to liberate"));
        dataList.add(new DataModel1("Persuit of offender into other jurisdiction","48","45","Police officer may pursue the arrest in any place of india"));
        dataList.add(new DataModel1("Person arrested to be informed of grounds of arrest and right to bail","50","47","1. Police officer arresting a person without warrant will inform him the ground of such arrest,\n" +
                "2. Other than no bailable offences, police officer will inform his entitlement to be release on bail"));
        dataList.add(new DataModel1("Obligation of person making arrest to inform about arrest, etc, to relative or friends","50A","48","Police officer to give the information of such arrest and the place where ,\n" +
                "arrested person is being held to any of his relatives, friends or such other person as may be disclosed by the arrestee,\n" +
                "3. An entry regarding the person who has been informed of the arrest of such person shall be made in a book to be kept in police station"));
        dataList.add(new DataModel1("Search of arrested person","51","49","Police officer to search an arrested person and place in safe custody all article, other than necessary wearing apparel found upon him by preparing a receipt with that regard \n" +
                "seize the articles\n" +
                "2. In case of female, such search shall be made by another female with strict regard to decency"));
        dataList.add(new DataModel1("Power to seize of offensive weapons","52","50","Offensive weapon to be seize from the arrested person shall be deliver to the court"));
        dataList.add(new DataModel1("Examination of accused by medical practitioner at request of police officer","53","51","1. When there are reasonable\n" +
                "grounds for believing that than examination of the person of the accused will afford evidence as to the commission of an offence, it shall be lawful for a \n" +
                "registered medical practitioner to make such an examination on the request of the police officer\n" +
                "2. In case of female such examination shall be made only by, or under the supervision of, a female registered medical practitioner"));
        dataList.add(new DataModel1("Examination of person accused of rape by medical practitioner","53A","52","When there are reasonable ground to believe that \n" +
                "the examination of an arrested accused on the charge of committing an offence of rape or an attempt to commit rape will afford evidences as to the commission of such offence,\n" +
                "it shall be lawful for a registered medical practitioner employed in a hospital run by the government or by the local authority to make such examination on the request of the police officer\n" +
                "2. Such examination may be done by any other registered medical practitioner if there is no such hospital run by government or local body within the radius of 16 KM from the PO"));
        dataList.add(new DataModel1("Examination of the arrested person by medical officer","54","53","when any person is arrested, he shall be examine by medical officer in the service of central/state government\n" +
                "2. If a medical officer of the central/state government is not available, such examination may be done by a registered medical practitioner\n" +
                "3. In case of female, the examination of the body shall be made only by or under the supervision of female medical officer"));
        dataList.add(new DataModel1("Identification of person arrested","54A","54","The person arrested on the charge of committing an offence and his identification\n" +
                "by any other person or persons is considered necessary for the purpose of investigation the court may on the request of the sho/IO direct the person so arrested\n" +
                "to subject himself to identification\n" +
                "2. If the person identifying the arrested person is mentally or physically disable such process of identification shall take place under the supervision of magistrate and \n" +
                "identification process shall be recorded by any audio video electronic means"));
        dataList.add(new DataModel1("Procedure when police officer deputes subordinate to arrest without warrant","55","55","For such arrest an order in writing,\n" +
                "specifying the person to be arrested and the offence or other cause for which arrest is to be made and officer so required is to be issued by the sho/IO"));
        dataList.add(new DataModel1("Health and safety of arrested person","55A","56","It shall be the duty of the person having the custody of an \n" +
                "excused to take reasonable care of his health and safety"));
        dataList.add(new DataModel1("Person arrested to be taken before magistrate or SHO","56","57","A police officer making an arrest without warrant\n" +
                "shall, without unnecessary delay and subject to the provisions of bail, take or send the person arrested before the magistrate or SHO"));
        dataList.add(new DataModel1("{Person arrested not to be detained more than 24 hours}","57","58","Know police officer shall detain in custody \n" +
                "a person arrested without warrant for a period exceeding 24 hours"));
        dataList.add(new DataModel1("Police to report apprehensions/arrests","58","59","SHO shall report to the DM the cases of all persons arrested \n" +
                "without person within the limits of his station"));
        dataList.add(new DataModel1("Discharge of person apprehended/arrested","59","60","No person who has been arrested by a police officer shall be\n" +
                "discharge except on his bond, or bail bond, or under the special order of the magistrate"));
        dataList.add(new DataModel1("Power, on escape, pursue and retake","60","61","If a person in lawful custody escapes or is rescued, the person\n" +
                "from whose custody he escaped or was rescued may immediately pursue and arrest him in any place of India "));
        dataList.add(new DataModel1("Arrest to be made strictly according to sanhita","60A","62","No arrest shall be made accept in accordance with \n" +
                "the provisions of this sanhita or any other law for the time being in force providing arrest"));
        dataList.add(new DataModel1("Summons how serve","62","64","1. Every summon shall be serve by a police officer or an officer of the court issuing\n" +
                "it or other public servant\n" +
                "2. The police station or the registrar in the court shall maintain a register to enter the address, email address, phone number and such other details\n" +
                "3. The summons shall, if practicable be serve personally on the person summoned\n" +
                "4. Summons bearing the image of courts seal may also be serve by electronic communication"));
        dataList.add(new DataModel1("Service of summons when persons summoned cannot be found","64","66","Summons may be served by leaving one \n" +
                "of the duplicates with sum adults member of the family of the person summoned residing with him and his signature be obtained on the back of other duplicate"));
        dataList.add(new DataModel1("Procedure when service of summon cannot be effected as before provided","65","67","If service of the \n" +
                "summon cannot be effected by the exercise of due diligence as per the provisions of section 64 and 66,the service officer shall affix one of the \n" +
                "duplicates of the summons to sum conspicuous part of the house or homestad in which person the summoned ordinarily resides"));
        dataList.add(new DataModel1("Service of summons on witness","69","71","Court can issue summons to a witness simultaneously by \n" +
                "sending it through electronic means"));
        dataList.add(new DataModel1("Warrant directed to police officer","74","76","A warrant directed to any police officer may also be\n" +
                " executed by any other police officer whose name is endorsed upon the warrant"));
        dataList.add(new DataModel1("Notification of substance of warrant","75","77","1. The police officer executing a warrant of arrest \n" +
                "shall notify the substance of the warrant to the person to be arrested\n" +
                "2. If required, the police officer shall show the warrant to the arrestee"));
        dataList.add(new DataModel1("Person arrested to be brought before court without delay","76","78","The person arrested shall produce \n" +
                "the arrested person before the court from where the warrant is issued before the completion of 24 hours"));
        dataList.add(new DataModel1("Where warrant may be executed","77","79","A warrant of arrest may be executed at any place in india"));
        dataList.add(new DataModel1("Warrant directed to police officer for execution outside jurisdiction","79","81","1. The police officer executing\n" +
                "such warrant shall obtain the endorsement either by an executive magistrate or a police officer not below the rank of SHO in whose jurisdiction the warrant is to be executed\n" +
                "2. The endorsement of executive magistrate or the SHO shall the sufficient authority to the police officer for execution of warrant\n" +
                "3. However the police officer may execute such warrant when there is reason to believe that the delay occasioned by obtaining the endorsement will prevent such execution"));
        dataList.add(new DataModel1("Procedure on arrest of person against whom warrant is issued outside jurisdiction","80","82","1. If the court is within 13 Kilometers\n" +
                " of the place of arrest or nearer than executive magistrate or Supdt. of Police or Commissioner of Police then the arrestee shall be brought before the court issuing the warrant\n" +
                "2. The police officer shall give the information of such arrest to the designated police officer of that district"));
        dataList.add(new DataModel1("Proclamation","82","84","The proclamation order shall be served as follows 1. It shall be publicly red in some conspicuous place of the town or village in which the person resides\n" +
                "2. It shall be affixed to some conspicuous part of the house or homestayed or some conspicuous place of such town or village\n" +
                "3. A copy of the proclamation shall be affixed to some conspicuous part of the court house\n" +
                "4. If the court show desires, the proclamation will be published in a daily newspaper circulating in that area"));
        dataList.add(new DataModel1("Summons to produce documents or other things","91","94","The court or any SHO may issue a summon for production of any document,\n" +
                " electronic communication,including communication devices likely to contain digital evidence, for the purpose of investigation device"));
        dataList.add(new DataModel1("Procedure as to letters","92","95","1. District magistrate, CJM, Court of session or High court may issue summon to postal\n" +
                "authority to deliver any document, parcel or thing in the custody of postal authority\n" +
                "2. Any judicial or executive magistrate, Commissioner of police or Supdt. of Police may require the postal authority to cause search to be made for and to detain any\n" +
                "document parcel or thing pending the order of a district magistrate,CJM or Session Court/High court"));
        dataList.add(new DataModel1("When search warrant may be issued","93","96","1. A Police officer can search a place by obtaining search warrant issued by the court under this section\n" +
                "2. The such search shall be restricted to the place for which search warrant has been issued"));
        dataList.add(new DataModel1("Search of place suspected to contain stolen property, forged document etc.","94","97","A DM, SDM or Magistrate of 1st class, Upon information and after such enquiry as he things necessary\n" +
                "may issue a warrant authorising any police officer above the rank of constable to search a place used for deposit or save of stolen property, or production/deposit/save of objectionable article"));
        dataList.add(new DataModel1("Power to declare certain publication forfeited and to issue search warrant for the same","95","98","The state government may, by notification, stating the grounds of its opinion, declare\n" +
                "every copy of the issue of the newspaper or book or any document to be forfeited to government and there upon any police officer may seize the same where above found in india"));
        dataList.add(new DataModel1("Direction, etc, of search warrants","99","102","The provisions of sections 32,72,74,76,79,80 and 81 shall apply to all search warrant issued under 96,97,98 or section 100 of BNNS 2023"));
        dataList.add(new DataModel1("Persons in-charge of closed place to allow search","100","103","1. Whenever any place liable to search or inspection is closed, any person residing in or being in-charge of such place will allow the police pre ingress\n"+
                "2. If in gress into such place cannot be so obtained, the police officer can break open any outer or inner door or window of any house or place\n" +
                "3. Any person inside or about such place is reasonably suspected of concealing about his person any article that person may also be searched and if such person is a women the search shall be made by another women with strict regard to decency\n" +
                "4. Before making a search the police officer shall call upon to or more independent and respectable inhabitants of that locality and there after the search shall be conducted in there presence\n" +
                "5. If no such inhabitant is available or is willing to be witness to the search, The police officer may issue an order in writing to them to do so\n" +
                "6. The occupant of the place searched shall be permitted to attend during the search and a copy of the search list signed by the witness and the police officer shall be given to him\n" +
                "7. Any person refusing to witness the search despite the written order of the police officer shall be deemed to have committed an offence U/s 222 of BNS 2023"));
        dataList.add(new DataModel1("Disposal of things found in search beyond jurisdiction","104","104","1. The seized things together with the search list will be immediately taken before the court issuing the warrant when such court is nearer than the court having jurisdiction of the place search\n" +
                "2. If the place is nearer to the court in jurisdiction of which it false, then the seized things and the search list shall be taken before such magistrate. After order by search court, the same shall be taken to the court issuing the warrant."));
        dataList.add(new DataModel1("Recording of search ans seizure through audio video electronic means","Provision not given","105-Newly added provision","1. The entire search proceedings, right from entering the place, search, preparation and signing of search memorandum/list and coming out of the place shall be recorded through any audio video electronic means preferably mobile phone\n" +
                "2. The police officer shall forward such recording to the DM, SDM or JM of first class"));
        dataList.add(new DataModel1("Power of police officer to seize certain property","102","106","1. Any police officer may seize any property which may be alleged or suspected to have being stolen, or which may be found under circumstances which create suspicion of the commission of any offence.\n" +
                "2. The subordinate police officer shall report such seizure to the SHO.\n" +
                "3. The SHO shall immediately report such seizure to the magistrate having jurisdiction.\n" +
                "4. If the seize property is subject to speedy and natural decay and if the person entitled to the possession of that property is unknown or absent and the value of such property is less than Rs. 500/-, the Supdt. of police may sell that property by auction. The provisions of sections 503 and 504 shall be practicable, apply to the net proceeds of such sell."));
        dataList.add(new DataModel1("Attachment, forfeiture or restoration of property","Provision not given","107-Newly added provision","1. Where a police officer making and investigation has reason to believe that any property is derived or obtained by criminal activity or from the commission of any offence, he may, with the approval of Supdt. of police submit application to the CJM.\n" +
                "2. The court may issue in notice upon such person to show cause within 14 days.\n" +
                "3. The court may pass ex parte order for attachment or seizure.\n" +
                "4. The court finds the attached or seized property to be the proceeds of crime, it may order for its distribution among the person affected by the crime.\n" +
                "5. The DM shall complete such distribution within a period of 60 days.\n" +
                "6. If their is no claimant for the distribution, the proceed of crime shall stand forfeited to the govt."));
        dataList.add(new DataModel1("Magistrate may direct search in his presence","103","108","Any magistrate may direct a search to be made in his presence of any place for the search of which he is competent to issue search warrant"));
        dataList.add(new DataModel1("Security for keeping peace in other cases","107","126","An Executive Magistrate upon receiving information that any person is likely to commit a breach of peace or disturb public tranquility or to do any wrongful that may create breach of peace or public tranquility, he may require such person to show cause by he should not be ordered to execute a bond or bail bond for keeping peace."));
        dataList.add(new DataModel1("Security for good behaviour from persons disseminating certain matters","108","127","An Executive Magistrate upon receiving information that any person orally or in writing or in any manner intentionally disseminates or attempts/abets to disseminate any matter the publication of which is punishable U/s 152 or 196, 197 or 299 of BNS or any matter concerning Judge he may issue show cause to that persons to execute a bond or bail bond"));
        dataList.add(new DataModel1("Security for good behaviour from suspected persons","109","128","An Executive Magistrate upon receiving information that a person is taking precautions to conceal his presence with a viw to commit a cognizable offence, he may issue show cause to execute a bond or bail bond for his good behaviour"));
        dataList.add(new DataModel1("Security for good behaviour from habitual offenders ","100","129","An Executive Magistrate upon receiving information that a person who is habitual offender of offences enlisted in this section resides in his jurisdiction, he may issue show cause to that person to execute a bail bond for his good behaviour"));
        dataList.add(new DataModel1("Summons or warrant in case of person not so present","113","132","1. If the person against whom the court of executive magistrate has issued show cause dose not appear before him, the court may issue warrant of arrest.\n" +
                "2. If Executive Magistrate receives a report of police officers that their is reason to fear the commission of a breach or peace which can not be prevented otherwise than by the immediate arrest of such persons, he may at any time issue a warrant for the arrest of that persons."));
        dataList.add(new DataModel1("Conditional order for removal or nuisance","133","152","A District Magistrate or a sub-divisional magistrate or any other Executive Magistrate specially empowered in this behalf, upon receipt the report of a police officer may make a conditional order requiring the person such obstruction or nuisance enlisted in this section."));
        dataList.add(new DataModel1("Power to issue order in urgent cases of nuisance or apprehended danger","144","163","1. A District Magistrate or sub-divisional magistrate or any other Executive Magistrate specially empowered in this behalf may issue prohibitory orders.\n" +
                "2, In case of emergency such orders may be passed ex parte without serving the notice.\n" +
                "3. Such order may directed to a particular individual or persons residing in a particular place or area.\n" +
                "4. Such order shall remain in force for a maximum period or to months\n" +
                "5. The period of two months may be extended to 6 months by the notification of the Govt."));
        dataList.add(new DataModel1("Arrest to prevent commission of cognizable offences","151","170","1. A police officer knowing of a design to commit any cognizable offence may arrest without the orders from a magistrate and without a warrant the person so designing, if appears to such police officers that the commission of the offence can not be otherwise prevented.\n" +
                "2. Such arrested person shall not be detained in custody for a period exceeding 24 hors from the time of his arrest."));
        dataList.add(new DataModel1("Information in cognizable","154","173","1. Information of the commission of cognizable offence may be given orally or by electronic communication to SHO.\n" +
                "2. The information my be given to any SHO, irrespective of the place where offence is committed.\n" +
                "3. If the information is given orally it shall be reduced to writing and be read over to the informant and shall be signed by the persons giving it.\n" +
                "4. If the information is received through electronic communication, it shall be taken or record on being signed by the sender within three days.\n" +
                "5. The information received shall be entered in the prescribed book.\n" +
                "6. If the information is given by the woman against whom offence under section 64, 65, 66, 67, 68 ,69, 70 ,71, 74 , 75 , 76, 77, 78 , 79 or 124 of BNS, 2023 is alleged to have been committed or attempted, them such information shall be recorded by a woman police officer or any woman officer.\n" +
                "7. In case where the person against whom an offence under section 64, 65, 66, 67, 68 ,69, 70 ,71, 74 , 75 , 76, 77, 78 , 79 or 124 of BNS, 2023 is alleged to have been committed or attempted, is temporarily or permanently mentally or physically disabled, then such information shall be recorded by a police officer at the residence of the person or at a convenient place of such person's choice in the presence of an interpreter or a special aducator.\n" +
                "8. The recording of information of such disabled shall be videographed.\n" +
                "9. The police shall get the statement of the disabled persons recorded by a Magistrate under section 183(6)(a) of BNSS.\n" +
                "10. The copy of the information recorded shall be given to the informant or the victim free of cost.\n" +
                "11. By the prior permission from an officer not below the rank of DYSP, considering the nature and gravity of offences which is punishable for three years or more but less than seven years, the SHO may proceed to conduct preliminary enquiry (PE) to ascertain whether there exists a prima facie case for proceeding in the matter within a period of 14 days.\n" +
                "12. But if there exists a prima facie case, the SHO will proceed for investigation.\n" +
                "13. Any person aggrieved by refusal by SHO may send the information in writing to the supdt. of police by post."));
        dataList.add(new DataModel1("Information of a non-cognizable case and investigation of such case","155","174","1. when information of a non-cognizable offence is given to SHO, he shall enter the substance of the information in the prescribed book.\n" +
                "2. SHO shall refer the informant to the magistrate.\n" +
                "3. SHO shall forward the daily dairy report of all such cases fortnightly to the magistrate.\n" +
                "4. No police officer shall investigate a non-cognizable case without the order of a magistrate.\n" +
                "5. Any police officer receiving the order of the magistrate may exercise the same powers in respect of investigation as in a cognizable case."));
        dataList.add(new DataModel1("Police officer's power to investigate cognizable case","156","175","1. Any SHO may investigate any cognizable case within his jurisdiction without the order of magistrate.\n" +
                "2. Supdt. of police may require a DYSP to investigate the case considering the nature and gravity of the offence.\n" +
                "3. Any magistrate empowered U/s 210 may order the investigation as above mentioned.\n" +
                "4. Any magistrate empowered U/s 210 may order investigation on a complaint against a public servant subject to (a) receiving the report form the superior officer and (b) after consideration of assertions made by the public servant as to the situation that led to the incident so alleged."));
        dataList.add(new DataModel1("Procedure for investigation","157","176","1. SHO shall forthwith send the report of the commission of the non-cognizable offence to the magistrate empowered to take cognizance.\n" +
                "2. SHO or the police officer deputed by him shall proceed in person for the PO.\n" +
                "3. The statement of the victim of rape shall be recorded by a woman police officer in the presence of her parents or guardian or near relatives or social worker at her residence and such statement may also be recorde through any audio video electronic means including mobile phone.\n" +
                "4. In case of offences punishable for 7 years or more the SHO shall cause the forensic expert to visit the crime scene to collect forensic evidence and the process shal be videographed with mobile phone or any other electronic devise.\n" +
                "5. The mandatory provision of the visit of forensic expert will be effected after the notification by the state govt. within a period of 5 years."));
        dataList.add(new DataModel1("Report how submitted","158","177","If the state Govt. so direct, every report sent to a magistrate U/s 176 shall be submitted through such superior officer of the police appointed by the state Govt."));
        dataList.add(new DataModel1("Police officer's power to require attendance of witnesses","160","179","1. An IO May issue notice for the attendance of a witness acquainted with the facts an circumstances of the case.\n" +
                "2. No notice shall be issued to a male person under the age of 15 years or above the age of 60 years or a woman or a mentally or physically disabled person or a person with acute illness.\n" +
                "3. If persons mentioned above are willing to attend at the police station they may be permitted. Otherwise they shall be examined at their residence."));
        dataList.add(new DataModel1("Examination of witness by police","161","180","1. The IO may Examine orally any person supposed to be acquainted with the fact and circumstances of tha case.\n" +
                "2. Such witness is bound to answer truly all questions relating to the case.\n" +
                "3. The police officer may reduce the statement of the witness into writing on a separate sheet.\n" +
                "4. The statement of the witness may also be recorded by audio video electronic means.\n" +
                "5. The statement of a woman against whom an offence U/s 64 to 71, 74 to 79 or section 124 of BNS, 2023 is alleged to have been committed of attempted shall be recorded by a woman police officer."));
        dataList.add(new DataModel1("Statements to police and use thereof ","162","181","No statement made by any witness to the IO and reduced into writing shall be signed by the witness."));
        dataList.add(new DataModel1("No inducement to be offered","163","182","1. No police officer (IO) shall offer or make any Inducement, threat or promise as mentioned in section 22 of BSA, 2023.\n" +
                "2. But the police officer (IO) shall not prevent any person from making statement of his own free will."));


        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("34","23","12","Arrest"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("10","18","57","fine"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));
        dataList.add(new DataModel1("FIR","233","123","enrnt"));



        adapter = new DataAdapter1(dataList);
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
