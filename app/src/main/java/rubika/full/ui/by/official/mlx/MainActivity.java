package rubika.full.ui.by.official.mlx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private double charkhesh = 0;
	
	private LinearLayout main;
	private LinearLayout main_nav;
	private LinearLayout linear_settings;
	private LinearLayout linear_vitren;
	private LinearLayout linear_rubino;
	private LinearLayout linear_massage;
	private LinearLayout linear_home;
	private LinearLayout linear_main_header_set;
	private ScrollView vscroll2;
	private LinearLayout linear81;
	private LinearLayout header_set;
	private ImageView img_more_set;
	private LinearLayout linear_set_name;
	private ImageView imageview18;
	private TextView set_txt_name_top;
	private TextView set_txt_statos_top;
	private LinearLayout linear_set_main_txt;
	private LinearLayout set_dun1;
	private LinearLayout set_meyan1;
	private LinearLayout set_dun2;
	private LinearLayout set_meyan2;
	private LinearLayout set_dun3;
	private LinearLayout set_meyan3;
	private LinearLayout set_dun4;
	private LinearLayout set_end_page_lineaer;
	private TextView set_txt1;
	private TextView set_txt2;
	private TextView set_txt3;
	private LinearLayout line1_set;
	private TextView set_txt4;
	private TextView set_txt5;
	private LinearLayout line2_set;
	private TextView set_txt6;
	private TextView set_txt7;
	private TextView set_txt8;
	private TextView set_txt9;
	private LinearLayout line3_set;
	private TextView set_txt10;
	private LinearLayout line4_set;
	private TextView set_txt11;
	private LinearLayout line5_set;
	private TextView set_txt12;
	private LinearLayout line6_set;
	private TextView set_txt13;
	private LinearLayout line7_set;
	private TextView set_txt14;
	private LinearLayout line8_set;
	private TextView set_txt15;
	private LinearLayout line9_set;
	private TextView set_txt16;
	private LinearLayout line10_set;
	private TextView set_txt17;
	private TextView set_txt18;
	private TextView set_txt19;
	private LinearLayout line11_set;
	private TextView set_txt20;
	private LinearLayout line12_set;
	private TextView set_txt21;
	private TextView set_txt22;
	private TextView set_txt23;
	private LinearLayout line13_set;
	private TextView set_txt24;
	private LinearLayout line14_set;
	private TextView set_txt25;
	private LinearLayout line15_set;
	private TextView set_txt26;
	private TextView set_txt27;
	private LinearLayout mian_header_vitren;
	private ScrollView vscroll1;
	private LinearLayout search_and_folows_vitren;
	private HorizontalScrollView scroll_vits_vitren;
	private LinearLayout line_header_votren;
	private ImageView img_search_vitren;
	private LinearLayout linear75;
	private ImageView img_folow_vitren;
	private TextView textview27;
	private LinearLayout vits_vitren;
	private LinearLayout gow1;
	private LinearLayout alfa1;
	private LinearLayout gow2;
	private LinearLayout alfa2;
	private LinearLayout gow3;
	private LinearLayout alfa3;
	private LinearLayout gow4;
	private LinearLayout alfa4;
	private LinearLayout gow5;
	private LinearLayout alfa5;
	private LinearLayout gow6;
	private LinearLayout alfa6;
	private LinearLayout gow7;
	private ImageView img_store_vitren;
	private TextView vit_txt1;
	private TextView vit_txt2;
	private TextView vit_txt3;
	private TextView vit_txt4;
	private TextView vit_txt5;
	private TextView vit_txt6;
	private TextView vit_txt7;
	private LinearLayout main_vitren_linear;
	private LinearLayout linear76;
	private LinearLayout linear5;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private LinearLayout linear10;
	private LinearLayout linear80;
	private LinearLayout linea_progress;
	private ImageView img_progress_vitren;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout header_rubino;
	private LinearLayout line_header_rubino;
	private ImageView imageview13;
	private ImageView imageview14;
	private LinearLayout linear69;
	private ImageView imageview15;
	private ImageView imageview16;
	private LinearLayout linear74;
	private LinearLayout linear73;
	private LinearLayout linear72;
	private ImageView error_loading_rubino;
	private LinearLayout header_in_massege_view;
	private LinearLayout pm;
	private LinearLayout linear12;
	private LinearLayout pm3;
	private LinearLayout linear29;
	private LinearLayout linear38;
	private LinearLayout linear57;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private ImageView search_in_massege_view;
	private LinearLayout linear4;
	private ImageView search2_logo_in_massege_view;
	private ImageView rubika_logo_in_massege_view;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout pm_line;
	private TextView textview1;
	private ImageView pin;
	private LinearLayout linear11;
	private TextView textview2;
	private ImageView imageview2;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private TextView textview9;
	private LinearLayout linear28;
	private TextView textview3;
	private ImageView img_pin;
	private LinearLayout linear18;
	private TextView textview4;
	private ImageView imageview4;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview8;
	private LinearLayout linear27;
	private TextView textview5;
	private LinearLayout linear25;
	private TextView textview6;
	private LinearLayout num;
	private TextView textview7;
	private ImageView imageview6;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private TextView textview10;
	private LinearLayout linear35;
	private TextView textview11;
	private ImageView imageview10;
	private LinearLayout linear36;
	private TextView textview12;
	private LinearLayout num1;
	private TextView textview13;
	private ImageView imageview7;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private TextView textview14;
	private LinearLayout linear44;
	private TextView textview15;
	private LinearLayout linear45;
	private TextView textview16;
	private LinearLayout num3;
	private TextView textview17;
	private ImageView imageview8;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private TextView textview22;
	private LinearLayout linear67;
	private TextView textview23;
	private ImageView imageview12;
	private LinearLayout linear64;
	private TextView textview24;
	private LinearLayout linear65;
	private TextView textview25;
	private LinearLayout custom_icon;
	private TextView textview26;
	private LinearLayout start_chat;
	private ImageView medad;
	private LinearLayout linear2;
	private LinearLayout linear_main_home;
	private LinearLayout linear_header_home;
	private LinearLayout line_header_home;
	private ImageView search;
	private LinearLayout linear1;
	private ImageView ic_trash;
	private ImageView rubika_logo;
	private ImageView imageview1;
	private TextView by_official_mlx;
	private TextView home_site_txt;
	private LinearLayout line_nav;
	private LinearLayout navigation_bar;
	private LinearLayout settings;
	private LinearLayout vitren;
	private LinearLayout rubino;
	private LinearLayout massage;
	private LinearLayout home;
	private ImageView img_settings;
	private TextView txt_setings;
	private ImageView img_vitren;
	private TextView txt_vitren;
	private ImageView img_rubino;
	private TextView txt_rubino;
	private ImageView img_massage;
	private TextView txt_massege;
	private ImageView img_home;
	private TextView txt_home;
	
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		main = (LinearLayout) findViewById(R.id.main);
		main_nav = (LinearLayout) findViewById(R.id.main_nav);
		linear_settings = (LinearLayout) findViewById(R.id.linear_settings);
		linear_vitren = (LinearLayout) findViewById(R.id.linear_vitren);
		linear_rubino = (LinearLayout) findViewById(R.id.linear_rubino);
		linear_massage = (LinearLayout) findViewById(R.id.linear_massage);
		linear_home = (LinearLayout) findViewById(R.id.linear_home);
		linear_main_header_set = (LinearLayout) findViewById(R.id.linear_main_header_set);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		header_set = (LinearLayout) findViewById(R.id.header_set);
		img_more_set = (ImageView) findViewById(R.id.img_more_set);
		linear_set_name = (LinearLayout) findViewById(R.id.linear_set_name);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		set_txt_name_top = (TextView) findViewById(R.id.set_txt_name_top);
		set_txt_statos_top = (TextView) findViewById(R.id.set_txt_statos_top);
		linear_set_main_txt = (LinearLayout) findViewById(R.id.linear_set_main_txt);
		set_dun1 = (LinearLayout) findViewById(R.id.set_dun1);
		set_meyan1 = (LinearLayout) findViewById(R.id.set_meyan1);
		set_dun2 = (LinearLayout) findViewById(R.id.set_dun2);
		set_meyan2 = (LinearLayout) findViewById(R.id.set_meyan2);
		set_dun3 = (LinearLayout) findViewById(R.id.set_dun3);
		set_meyan3 = (LinearLayout) findViewById(R.id.set_meyan3);
		set_dun4 = (LinearLayout) findViewById(R.id.set_dun4);
		set_end_page_lineaer = (LinearLayout) findViewById(R.id.set_end_page_lineaer);
		set_txt1 = (TextView) findViewById(R.id.set_txt1);
		set_txt2 = (TextView) findViewById(R.id.set_txt2);
		set_txt3 = (TextView) findViewById(R.id.set_txt3);
		line1_set = (LinearLayout) findViewById(R.id.line1_set);
		set_txt4 = (TextView) findViewById(R.id.set_txt4);
		set_txt5 = (TextView) findViewById(R.id.set_txt5);
		line2_set = (LinearLayout) findViewById(R.id.line2_set);
		set_txt6 = (TextView) findViewById(R.id.set_txt6);
		set_txt7 = (TextView) findViewById(R.id.set_txt7);
		set_txt8 = (TextView) findViewById(R.id.set_txt8);
		set_txt9 = (TextView) findViewById(R.id.set_txt9);
		line3_set = (LinearLayout) findViewById(R.id.line3_set);
		set_txt10 = (TextView) findViewById(R.id.set_txt10);
		line4_set = (LinearLayout) findViewById(R.id.line4_set);
		set_txt11 = (TextView) findViewById(R.id.set_txt11);
		line5_set = (LinearLayout) findViewById(R.id.line5_set);
		set_txt12 = (TextView) findViewById(R.id.set_txt12);
		line6_set = (LinearLayout) findViewById(R.id.line6_set);
		set_txt13 = (TextView) findViewById(R.id.set_txt13);
		line7_set = (LinearLayout) findViewById(R.id.line7_set);
		set_txt14 = (TextView) findViewById(R.id.set_txt14);
		line8_set = (LinearLayout) findViewById(R.id.line8_set);
		set_txt15 = (TextView) findViewById(R.id.set_txt15);
		line9_set = (LinearLayout) findViewById(R.id.line9_set);
		set_txt16 = (TextView) findViewById(R.id.set_txt16);
		line10_set = (LinearLayout) findViewById(R.id.line10_set);
		set_txt17 = (TextView) findViewById(R.id.set_txt17);
		set_txt18 = (TextView) findViewById(R.id.set_txt18);
		set_txt19 = (TextView) findViewById(R.id.set_txt19);
		line11_set = (LinearLayout) findViewById(R.id.line11_set);
		set_txt20 = (TextView) findViewById(R.id.set_txt20);
		line12_set = (LinearLayout) findViewById(R.id.line12_set);
		set_txt21 = (TextView) findViewById(R.id.set_txt21);
		set_txt22 = (TextView) findViewById(R.id.set_txt22);
		set_txt23 = (TextView) findViewById(R.id.set_txt23);
		line13_set = (LinearLayout) findViewById(R.id.line13_set);
		set_txt24 = (TextView) findViewById(R.id.set_txt24);
		line14_set = (LinearLayout) findViewById(R.id.line14_set);
		set_txt25 = (TextView) findViewById(R.id.set_txt25);
		line15_set = (LinearLayout) findViewById(R.id.line15_set);
		set_txt26 = (TextView) findViewById(R.id.set_txt26);
		set_txt27 = (TextView) findViewById(R.id.set_txt27);
		mian_header_vitren = (LinearLayout) findViewById(R.id.mian_header_vitren);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		search_and_folows_vitren = (LinearLayout) findViewById(R.id.search_and_folows_vitren);
		scroll_vits_vitren = (HorizontalScrollView) findViewById(R.id.scroll_vits_vitren);
		line_header_votren = (LinearLayout) findViewById(R.id.line_header_votren);
		img_search_vitren = (ImageView) findViewById(R.id.img_search_vitren);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		img_folow_vitren = (ImageView) findViewById(R.id.img_folow_vitren);
		textview27 = (TextView) findViewById(R.id.textview27);
		vits_vitren = (LinearLayout) findViewById(R.id.vits_vitren);
		gow1 = (LinearLayout) findViewById(R.id.gow1);
		alfa1 = (LinearLayout) findViewById(R.id.alfa1);
		gow2 = (LinearLayout) findViewById(R.id.gow2);
		alfa2 = (LinearLayout) findViewById(R.id.alfa2);
		gow3 = (LinearLayout) findViewById(R.id.gow3);
		alfa3 = (LinearLayout) findViewById(R.id.alfa3);
		gow4 = (LinearLayout) findViewById(R.id.gow4);
		alfa4 = (LinearLayout) findViewById(R.id.alfa4);
		gow5 = (LinearLayout) findViewById(R.id.gow5);
		alfa5 = (LinearLayout) findViewById(R.id.alfa5);
		gow6 = (LinearLayout) findViewById(R.id.gow6);
		alfa6 = (LinearLayout) findViewById(R.id.alfa6);
		gow7 = (LinearLayout) findViewById(R.id.gow7);
		img_store_vitren = (ImageView) findViewById(R.id.img_store_vitren);
		vit_txt1 = (TextView) findViewById(R.id.vit_txt1);
		vit_txt2 = (TextView) findViewById(R.id.vit_txt2);
		vit_txt3 = (TextView) findViewById(R.id.vit_txt3);
		vit_txt4 = (TextView) findViewById(R.id.vit_txt4);
		vit_txt5 = (TextView) findViewById(R.id.vit_txt5);
		vit_txt6 = (TextView) findViewById(R.id.vit_txt6);
		vit_txt7 = (TextView) findViewById(R.id.vit_txt7);
		main_vitren_linear = (LinearLayout) findViewById(R.id.main_vitren_linear);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linea_progress = (LinearLayout) findViewById(R.id.linea_progress);
		img_progress_vitren = (ImageView) findViewById(R.id.img_progress_vitren);
		linear70 = (LinearLayout) findViewById(R.id.linear70);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		header_rubino = (LinearLayout) findViewById(R.id.header_rubino);
		line_header_rubino = (LinearLayout) findViewById(R.id.line_header_rubino);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		error_loading_rubino = (ImageView) findViewById(R.id.error_loading_rubino);
		header_in_massege_view = (LinearLayout) findViewById(R.id.header_in_massege_view);
		pm = (LinearLayout) findViewById(R.id.pm);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		pm3 = (LinearLayout) findViewById(R.id.pm3);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		search_in_massege_view = (ImageView) findViewById(R.id.search_in_massege_view);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		search2_logo_in_massege_view = (ImageView) findViewById(R.id.search2_logo_in_massege_view);
		rubika_logo_in_massege_view = (ImageView) findViewById(R.id.rubika_logo_in_massege_view);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		pm_line = (LinearLayout) findViewById(R.id.pm_line);
		textview1 = (TextView) findViewById(R.id.textview1);
		pin = (ImageView) findViewById(R.id.pin);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview3 = (TextView) findViewById(R.id.textview3);
		img_pin = (ImageView) findViewById(R.id.img_pin);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview6 = (TextView) findViewById(R.id.textview6);
		num = (LinearLayout) findViewById(R.id.num);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview12 = (TextView) findViewById(R.id.textview12);
		num1 = (LinearLayout) findViewById(R.id.num1);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		textview16 = (TextView) findViewById(R.id.textview16);
		num3 = (LinearLayout) findViewById(R.id.num3);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear67 = (LinearLayout) findViewById(R.id.linear67);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		textview24 = (TextView) findViewById(R.id.textview24);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		textview25 = (TextView) findViewById(R.id.textview25);
		custom_icon = (LinearLayout) findViewById(R.id.custom_icon);
		textview26 = (TextView) findViewById(R.id.textview26);
		start_chat = (LinearLayout) findViewById(R.id.start_chat);
		medad = (ImageView) findViewById(R.id.medad);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear_main_home = (LinearLayout) findViewById(R.id.linear_main_home);
		linear_header_home = (LinearLayout) findViewById(R.id.linear_header_home);
		line_header_home = (LinearLayout) findViewById(R.id.line_header_home);
		search = (ImageView) findViewById(R.id.search);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		ic_trash = (ImageView) findViewById(R.id.ic_trash);
		rubika_logo = (ImageView) findViewById(R.id.rubika_logo);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		by_official_mlx = (TextView) findViewById(R.id.by_official_mlx);
		home_site_txt = (TextView) findViewById(R.id.home_site_txt);
		line_nav = (LinearLayout) findViewById(R.id.line_nav);
		navigation_bar = (LinearLayout) findViewById(R.id.navigation_bar);
		settings = (LinearLayout) findViewById(R.id.settings);
		vitren = (LinearLayout) findViewById(R.id.vitren);
		rubino = (LinearLayout) findViewById(R.id.rubino);
		massage = (LinearLayout) findViewById(R.id.massage);
		home = (LinearLayout) findViewById(R.id.home);
		img_settings = (ImageView) findViewById(R.id.img_settings);
		txt_setings = (TextView) findViewById(R.id.txt_setings);
		img_vitren = (ImageView) findViewById(R.id.img_vitren);
		txt_vitren = (TextView) findViewById(R.id.txt_vitren);
		img_rubino = (ImageView) findViewById(R.id.img_rubino);
		txt_rubino = (TextView) findViewById(R.id.txt_rubino);
		img_massage = (ImageView) findViewById(R.id.img_massage);
		txt_massege = (TextView) findViewById(R.id.txt_massege);
		img_home = (ImageView) findViewById(R.id.img_home);
		txt_home = (TextView) findViewById(R.id.txt_home);
		
		error_loading_rubino.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		pm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "پیام های ذخیره شده");
			}
		});
		
		home_site_txt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent jjjjjjjjjjjhhhggfff = new Intent();
				jjjjjjjjjjjhhhggfff.setAction(Intent.ACTION_VIEW);
				 jjjjjjjjjjjhhhggfff.setData(Uri.parse("https://Rubika.ir/sketch_learn")); startActivity(jjjjjjjjjjjhhhggfff);
			}
		});
		
		settings.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rippleRoundStroke(settings, "#ffffff", "#616161", 0, 0, "#ffffff");
				img_home.setImageResource(R.drawable.home);
				img_massage.setImageResource(R.drawable.massage);
				img_rubino.setImageResource(R.drawable.rubino);
				img_vitren.setImageResource(R.drawable.vitren);
				img_settings.setImageResource(R.drawable.settings_click);
				linear_home.setVisibility(View.GONE);
				linear_massage.setVisibility(View.GONE);
				linear_rubino.setVisibility(View.GONE);
				linear_vitren.setVisibility(View.GONE);
				linear_settings.setVisibility(View.VISIBLE);
			}
		});
		
		vitren.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rippleRoundStroke(vitren, "#ffffff", "#616161", 0, 0, "#ffffff");
				img_home.setImageResource(R.drawable.home);
				img_massage.setImageResource(R.drawable.massage);
				img_rubino.setImageResource(R.drawable.rubino);
				img_vitren.setImageResource(R.drawable.vitren_click);
				img_settings.setImageResource(R.drawable.settings);
				linear_home.setVisibility(View.GONE);
				linear_massage.setVisibility(View.GONE);
				linear_rubino.setVisibility(View.GONE);
				linear_vitren.setVisibility(View.VISIBLE);
				linear_settings.setVisibility(View.GONE);
				android.graphics.drawable.GradientDrawable JNXSRQAN_SSK = new android.graphics.drawable.GradientDrawable();
				JNXSRQAN_SSK.setColor(Color.parseColor("#FFFFFFFF"));
				JNXSRQAN_SSK.setCornerRadii(new float[] {10, 10, 10, 10, 10, 10, 10, 10});
				JNXSRQAN_SSK.setStroke(3, Color.parseColor("#FFE0E0E0"));
				gow1.setBackground(JNXSRQAN_SSK);
				gow2.setBackground(JNXSRQAN_SSK);
				gow3.setBackground(JNXSRQAN_SSK);
				gow4.setBackground(JNXSRQAN_SSK);
				gow5.setBackground(JNXSRQAN_SSK);
				gow6.setBackground(JNXSRQAN_SSK);
				gow7.setBackground(JNXSRQAN_SSK);
				
			}
		});
		
		rubino.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rippleRoundStroke(rubino, "#ffffff", "#616161", 0, 0, "#ffffff");
				img_home.setImageResource(R.drawable.home);
				img_massage.setImageResource(R.drawable.massage);
				img_rubino.setImageResource(R.drawable.rubino_click);
				img_vitren.setImageResource(R.drawable.vitren);
				img_settings.setImageResource(R.drawable.settings);
				linear_home.setVisibility(View.GONE);
				linear_massage.setVisibility(View.GONE);
				linear_rubino.setVisibility(View.VISIBLE);
				linear_vitren.setVisibility(View.GONE);
				linear_settings.setVisibility(View.GONE);
			}
		});
		
		massage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rippleRoundStroke(massage, "#ffffff", "#616161", 0, 0, "#ffffff");
				img_home.setImageResource(R.drawable.home);
				img_massage.setImageResource(R.drawable.massage_click);
				img_rubino.setImageResource(R.drawable.rubino);
				img_vitren.setImageResource(R.drawable.vitren);
				img_settings.setImageResource(R.drawable.settings);
				linear_home.setVisibility(View.GONE);
				linear_massage.setVisibility(View.VISIBLE);
				linear_rubino.setVisibility(View.GONE);
				linear_vitren.setVisibility(View.GONE);
				linear_settings.setVisibility(View.GONE);
			}
		});
		
		home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rippleRoundStroke(home, "#ffffff", "#616161", 0, 0, "#ffffff");
				img_home.setImageResource(R.drawable.home_click);
				img_massage.setImageResource(R.drawable.massage);
				img_rubino.setImageResource(R.drawable.rubino);
				img_vitren.setImageResource(R.drawable.vitren);
				img_settings.setImageResource(R.drawable.settings);
				linear_home.setVisibility(View.VISIBLE);
				linear_massage.setVisibility(View.GONE);
				linear_rubino.setVisibility(View.GONE);
				linear_vitren.setVisibility(View.GONE);
				linear_settings.setVisibility(View.GONE);
			}
		});
	}
	
	private void initializeLogic() {
		_ui_main();
		_DARK_ICONS();
		_home_class();
		_massage_class();
		_rubino_class();
		_vitren_class();
		_settings_class();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _DARK_ICONS () {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _vitren_class () {
		int[] colorsCRNMI = { Color.parseColor("#F5F5F5"), Color.parseColor("#F5F5F5") }; android.graphics.drawable.GradientDrawable CRNMI = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNMI);
		CRNMI.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)0,(int)0,(int)0,(int)0});
		CRNMI.setStroke((int) 0, Color.parseColor("#000000"));
		mian_header_vitren.setElevation((float) 0);
		mian_header_vitren.setBackground(CRNMI);
		
		android.graphics.drawable.GradientDrawable JNXSRQAN_SSK = new android.graphics.drawable.GradientDrawable();
		JNXSRQAN_SSK.setColor(Color.parseColor("#FFFFFFFF"));
		JNXSRQAN_SSK.setCornerRadii(new float[] {10, 10, 10, 10, 10, 10, 10, 10});
		JNXSRQAN_SSK.setStroke(3, Color.parseColor("#FFE0E0E0"));
		gow1.setBackground(JNXSRQAN_SSK);
		gow2.setBackground(JNXSRQAN_SSK);
		gow3.setBackground(JNXSRQAN_SSK);
		gow4.setBackground(JNXSRQAN_SSK);
		gow5.setBackground(JNXSRQAN_SSK);
		gow6.setBackground(JNXSRQAN_SSK);
		gow7.setBackground(JNXSRQAN_SSK);
		
		vit_txt1.setTextSize((float)13);
		vit_txt2.setTextSize((float)13);
		vit_txt3.setTextSize((float)13);
		vit_txt4.setTextSize((float)13);
		
		vit_txt5.setTextSize((float)13);
		
		vit_txt6.setTextSize((float)13);
		
		vit_txt7.setTextSize((float)13);
		img_store_vitren.setColorFilter(0xFF424242, PorterDuff.Mode.MULTIPLY);
		img_search_vitren.setColorFilter(0xFF212121, PorterDuff.Mode.MULTIPLY);
		timer = new TimerTask() {
				@Override
				public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
										charkhesh++;
										img_progress_vitren.setRotation((float)(charkhesh));
								}
						});
				}
		};
		_timer.scheduleAtFixedRate(timer, (int)(2), (int)(2));
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						android.graphics.drawable.GradientDrawable JNXSRQAN_SSK = new android.graphics.drawable.GradientDrawable();
						JNXSRQAN_SSK.setColor(Color.parseColor("#FFFFFFFF"));
						JNXSRQAN_SSK.setCornerRadii(new float[] {10, 10, 10, 10, 10, 10, 10, 10});
						JNXSRQAN_SSK.setStroke(3, Color.parseColor("#FFE0E0E0"));
						gow1.setBackground(JNXSRQAN_SSK);
						gow2.setBackground(JNXSRQAN_SSK);
						gow3.setBackground(JNXSRQAN_SSK);
						gow4.setBackground(JNXSRQAN_SSK);
						gow5.setBackground(JNXSRQAN_SSK);
						gow6.setBackground(JNXSRQAN_SSK);
						gow7.setBackground(JNXSRQAN_SSK);
						
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(timer, (int)(10), (int)(10));
	}
	
	
	public void _settings_class () {
		
		img_more_set.setColorFilter(0xFF424242, PorterDuff.Mode.MULTIPLY);
		set_dun1.setElevation((float)4);
		set_dun2.setElevation((float)4);
		set_dun3.setElevation((float)4);
		set_dun4.setElevation((float)1);
		linear_main_header_set.setElevation((float)13);
		set_txt9.setTextSize((float)17);
		set_txt10.setTextSize((float)17);
		set_txt11.setTextSize((float)17);
		set_txt12.setTextSize((float)17);
		set_txt13.setTextSize((float)17);
		set_txt14.setTextSize((float)17);
		set_txt15.setTextSize((float)17);
		set_txt16.setTextSize((float)17);
		set_txt17.setTextSize((float)17);
		
		
		set_txt19.setTextSize((float)17);
		set_txt20.setTextSize((float)17);
		set_txt21.setTextSize((float)17);
		
		set_txt2.setTextSize((float)16);
		set_txt4.setTextSize((float)16);
		set_txt6.setTextSize((float)16);
		
		
		set_txt23.setTextSize((float)17);
		set_txt24.setTextSize((float)17);
		set_txt25.setTextSize((float)17);
		set_txt26.setTextSize((float)17);
		
		
		set_txt1.setTextSize((float)15);
		set_txt8.setTextSize((float)15);
		set_txt18.setTextSize((float)15);
		set_txt22.setTextSize((float)15);
		
		set_txt3.setTextSize((float)13);
		set_txt5.setTextSize((float)13);
		set_txt7.setTextSize((float)13);
		
		
		//Official_Mlx
	}
	
	
	public void _massage_class () {
		search_in_massege_view.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		rubika_logo_in_massege_view.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		search2_logo_in_massege_view.setColorFilter(0xFFF5F5F5, PorterDuff.Mode.MULTIPLY);
		ic_trash.setColorFilter(0xFFF5F5F5, PorterDuff.Mode.MULTIPLY);
		pin.setColorFilter(0xFFA8A8A8, PorterDuff.Mode.MULTIPLY);
		img_pin.setColorFilter(0xFFA8A8A8, PorterDuff.Mode.MULTIPLY);
		header_in_massege_view.setElevation((float)10);
		medad.setElevation((float)10);
		int[] colorsCRNUC = { Color.parseColor("#4ECC00"), Color.parseColor("#4ECC00") }; android.graphics.drawable.GradientDrawable CRNUC = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNUC);
		CRNUC.setCornerRadii(new float[]{(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360});
		CRNUC.setStroke((int) 0, Color.parseColor("#000000"));
		num.setElevation((float) 0);
		num.setBackground(CRNUC);
		
		num1.setElevation((float) 0);
		num1.setBackground(CRNUC);
		
		num3.setElevation((float) 0);
		num3.setBackground(CRNUC);
		int[] colorsCRNNB = { Color.parseColor("#66A9E0"), Color.parseColor("#66A9E0") }; android.graphics.drawable.GradientDrawable CRNNB = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNNB);
		CRNNB.setCornerRadii(new float[]{(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360});
		CRNNB.setStroke((int) 0, Color.parseColor("#000000"));
		start_chat.setElevation((float) 0);
		start_chat.setBackground(CRNNB);
		
		int[] colorsCRNMA = { Color.parseColor("#E46554"), Color.parseColor("#E46554") }; android.graphics.drawable.GradientDrawable CRNMA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNMA);
		CRNMA.setCornerRadii(new float[]{(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360,(int)360});
		CRNMA.setStroke((int) 0, Color.parseColor("#000000"));
		custom_icon.setElevation((float) 0);
		custom_icon.setBackground(CRNMA);
		
	}
	
	
	public void _rubino_class () {
		header_rubino.setElevation((float)10);
		error_loading_rubino.setColorFilter(0xFF616161, PorterDuff.Mode.MULTIPLY);
	}
	
	
	public void _home_class () {
		linear_header_home.setElevation((float)15);
		search.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		rubika_logo.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		ic_trash.setColorFilter(0xFFF5F5F5, PorterDuff.Mode.MULTIPLY);
		by_official_mlx.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
		home_site_txt.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
	}
	
	
	public void _ui_main () {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(0xFFE0E0E0);
		}
		main_nav.setElevation((float)5);
		txt_setings.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		txt_vitren.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		txt_rubino.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		txt_massege.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		txt_home.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		linear_home.setVisibility(View.GONE);
		linear_massage.setVisibility(View.VISIBLE);
		linear_rubino.setVisibility(View.GONE);
		linear_vitren.setVisibility(View.GONE);
		linear_settings.setVisibility(View.GONE);
		
		final AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).create();
		LayoutInflater inflater = getLayoutInflater();
		
		View convertView = (View) inflater.inflate(R.layout.custom_dialog, null);
		dialog.setView(convertView);
		
		TextView txt1 = (TextView)
		convertView.findViewById(R.id.textview1);
		
		txt1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanwebregular.ttf"), 0);
		
		
		TextView txt2 = (TextView)
		convertView.findViewById(R.id.textview2);
		
		txt2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanweblight.ttf"), 0);
		
		
		TextView txt3 = (TextView)
		convertView.findViewById(R.id.textview3);
		
		txt3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/iranyekanweblight.ttf"), 1);
		
		LinearLayout card = (LinearLayout)
		convertView.findViewById(R.id.card);
		
		int[] colorsCRNXY = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNXY = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNXY);
		CRNXY.setCornerRadii(new float[]{(int)21,(int)21,(int)21,(int)21,(int)21,(int)21,(int)21,(int)21});
		CRNXY.setStroke((int) 1, Color.parseColor("#EEEEEE"));
		card.setElevation((float) 0);
		card.setBackground(CRNXY);
		
		LinearLayout button = (LinearLayout)
		convertView.findViewById(R.id.button);
		
		int[] colorsCRNLL = { Color.parseColor("#fafafa"), Color.parseColor("#FAFAFA") }; android.graphics.drawable.GradientDrawable CRNLL = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNLL);
		CRNLL.setCornerRadii(new float[]{(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20});
		CRNLL.setStroke((int) 1, Color.parseColor("#F5F6F4"));
		button.setElevation((float) 0);
		button.setBackground(CRNLL);
		
		
		ScrollView scroll = (ScrollView)
		convertView.findViewById(R.id.scroll);
		
		int[] colorsCRNDO = { Color.parseColor("#fafafa"), Color.parseColor("#FAFAFA") }; android.graphics.drawable.GradientDrawable CRNDO = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNDO);
		CRNDO.setCornerRadii(new float[]{(int)15,(int)15,(int)15,(int)15,(int)15,(int)15,(int)15,(int)15});
		CRNDO.setStroke((int) 2, Color.parseColor("#F5F6F4"));
		scroll.setElevation((float) 0);
		scroll.setBackground(CRNDO);
		
		button.setOnClickListener(new View.OnClickListener(){
			    public void onClick(View v){
				dialog.dismiss();
				       
				       
				    }
		});
		
		     
		dialog.show();
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}