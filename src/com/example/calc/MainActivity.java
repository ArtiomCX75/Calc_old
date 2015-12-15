package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	public Button bMC, bMR, bMplus, bMminus, bMS, bPercent, bPow, bXX, b1divX, bCE, bC, bBack, bDiv, b7, b8, b9, bMult,
			b4, b5, b6, bMinus, b1, b2, b3, bPlus, bSign, b0, bComma, bEqual;
	public TextView textHis, textRes;
	public String prevRes = "";
	public boolean needClean = false;
	public boolean showRes = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		createButtons();
	}

	public void createButtons() {
		bMC = (Button) findViewById(R.id.bMC);
		bMC.setOnClickListener(this);
		bMR = (Button) findViewById(R.id.bMR);
		bMR.setOnClickListener(this);
		bMplus = (Button) findViewById(R.id.bMplus);
		bMplus.setOnClickListener(this);
		bMminus = (Button) findViewById(R.id.bMminus);
		bMminus.setOnClickListener(this);
		bMS = (Button) findViewById(R.id.bMset);
		bMS.setOnClickListener(this);
		bPercent = (Button) findViewById(R.id.bPercent);
		bPercent.setOnClickListener(this);
		bPow = (Button) findViewById(R.id.bPow);
		bPow.setOnClickListener(this);
		bXX = (Button) findViewById(R.id.bXX);
		bXX.setOnClickListener(this);
		b1divX = (Button) findViewById(R.id.b1divX);
		b1divX.setOnClickListener(this);
		bCE = (Button) findViewById(R.id.bCE);
		bCE.setOnClickListener(this);
		bC = (Button) findViewById(R.id.bC);
		bC.setOnClickListener(this);
		bBack = (Button) findViewById(R.id.bBackspace);
		bBack.setOnClickListener(this);
		bDiv = (Button) findViewById(R.id.bDiv);
		bDiv.setOnClickListener(this);
		b7 = (Button) findViewById(R.id.b7);
		b7.setOnClickListener(this);
		b8 = (Button) findViewById(R.id.b8);
		b8.setOnClickListener(this);
		b9 = (Button) findViewById(R.id.b9);
		b9.setOnClickListener(this);
		bMult = (Button) findViewById(R.id.bMulti);
		bMult.setOnClickListener(this);
		b4 = (Button) findViewById(R.id.b4);
		b4.setOnClickListener(this);
		b5 = (Button) findViewById(R.id.b5);
		b5.setOnClickListener(this);
		b6 = (Button) findViewById(R.id.b6);
		b6.setOnClickListener(this);
		bMinus = (Button) findViewById(R.id.bMinus);
		bMinus.setOnClickListener(this);
		b1 = (Button) findViewById(R.id.b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.b2);
		b2.setOnClickListener(this);
		b3 = (Button) findViewById(R.id.b3);
		b3.setOnClickListener(this);
		bPlus = (Button) findViewById(R.id.bPlus);
		bPlus.setOnClickListener(this);
		bSign = (Button) findViewById(R.id.bSign);
		bSign.setOnClickListener(this);
		b0 = (Button) findViewById(R.id.b0);
		b0.setOnClickListener(this);
		bComma = (Button) findViewById(R.id.bComma);
		bComma.setOnClickListener(this);
		bEqual = (Button) findViewById(R.id.bEqual);
		bEqual.setOnClickListener(this);

		textHis = (TextView) findViewById(R.id.textHis);
		textRes = (TextView) findViewById(R.id.textRes);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bMC:

			break;

		case R.id.bMR:

			break;

		case R.id.bMplus:

			break;

		case R.id.bMminus:

			break;

		case R.id.bMset:

			break;

		case R.id.bPercent:

			break;

		case R.id.bPow:

			break;

		case R.id.bXX:
			if (!(getRes().equals(""))) {
				addHis(getRes() + "^");
				setRes("");
			}
			break;

		case R.id.b1divX:

			break;

		case R.id.bCE:
			setRes("");
			showRes = false;
			break;

		case R.id.bC:
			setHis("");
			setRes("");
			prevRes = "";
			showRes = false;
			break;

		case R.id.bBackspace:
			String s1 = getRes();
			if (s1.equals("")) {

			} else {
				String s2 = s1.substring(0, s1.length() - 1);
				setRes(s2);
			}
			break;

		case R.id.bDiv:
			if ((!(getRes().equals(""))) && (!(needClean))) {
				calc();
				addHis(getRes() + "/");
				if (showRes)
					setRes("= " + prevRes);
				needClean = true;
				showRes = true;
			}
			break;

		case R.id.b7:
			addRes("7");
			break;

		case R.id.b8:
			addRes("8");
			break;

		case R.id.b9:
			addRes("9");
			break;

		case R.id.bMulti:
			if ((!(getRes().equals(""))) && (!(needClean))) {
				calc();
				addHis(getRes() + "*");
				if (showRes)
					setRes("= " + prevRes);
				needClean = true;
				showRes = true;
			}
			break;

		case R.id.b4:
			addRes("4");
			break;

		case R.id.b5:
			addRes("5");
			break;

		case R.id.b6:
			addRes("6");
			break;

		case R.id.bMinus:
			if ((!(getRes().equals(""))) && (!(needClean))) {
				calc();
				addHis(getRes() + "-");
				if (showRes)
					setRes("= " + prevRes);
				needClean = true;
				showRes = true;
			}
			break;

		case R.id.b1:
			addRes("1");
			break;

		case R.id.b2:
			addRes("2");
			break;

		case R.id.b3:
			addRes("3");
			break;

		case R.id.bPlus:
			if ((!(getRes().equals(""))) && (!(needClean))) {
				calc();
				addHis(getRes() + "+");
				if (showRes)
					setRes("= " + prevRes);
				needClean = true;
				showRes = true;
			}
			break;

		case R.id.bSign:

			break;

		case R.id.b0:
			addRes("0");
			break;

		case R.id.bComma:

			break;

		case R.id.bEqual:
			if ((!(getRes().equals(""))) && (!(needClean))) {
				calc();
				addHis(getRes());
				if (showRes)
					setRes("= " + prevRes);
				//needClean = true;
				showRes = true; //нужно добавить третью булеву переменную, 
				//которая разрешает пользоваться знаком только один раз подряд
			}   //в знаках заменить нидклин на нее. поднимать фолаг в знаках, сбрасывать при вводе текста
			break;

		default:
			break;
		}
	}

	public void setRes(String s) {
		textRes.setText(s);
	}

	public void setHis(String s) {
		textHis.setText(s);
	}

	public String getRes() {
		return textRes.getText().toString();
	}

	public String getHis() {
		return textHis.getText().toString();
	}

	public void addRes(String s) {
		if (needClean) {
			textRes.setText(s);
			needClean = false;
		} else
			textRes.setText(getRes() + s);
	}

	public void addHis(String s) {
		textHis.setText(getHis() + s);
	}

	public void calc() {
		if (prevRes.equals("")) {
			prevRes = getRes();
		} else {
			String sign = getHis();
			sign = sign.substring(sign.length() - 1, sign.length());
			make(prevRes, sign, getRes());
		}
	}

	public void make(String a, String sign, String b) {
		if (sign.equals("+")) {
			int c = Integer.valueOf(a) + Integer.valueOf(b);
			prevRes = String.valueOf(c);
		}
		if (sign.equals("-")) {
			int c = Integer.valueOf(a) - Integer.valueOf(b);
			prevRes = String.valueOf(c);
		}
		if (sign.equals("*")) {
			int c = Integer.valueOf(a) * Integer.valueOf(b);
			prevRes = String.valueOf(c);
		}
		if (sign.equals("/")) {
			int c = Integer.valueOf(a) / Integer.valueOf(b);
			prevRes = String.valueOf(c);
		}
	}

}
