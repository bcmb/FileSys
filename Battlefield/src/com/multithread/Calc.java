package com.multithread;

public class Calc {

	public static void main(String[] args) {
		String operator = "";
		String firstArg = "";
		String secondArg = "";
		
		//processor class
		
		int result;
		
		switch (operator) {
		case "+":
			result = (Integer.parseInt(firstArg) + Integer.parseInt(secondArg));
			break;
		case "-":
			result = (Integer.parseInt(firstArg) - Integer.parseInt(secondArg));
			break;
		case "/":
			result = (Integer.parseInt(firstArg) / Integer.parseInt(secondArg));
			break;
		case "*":
			result = (Integer.parseInt(firstArg) * Integer.parseInt(secondArg));
			break;
		default:
			result = 0;
			break;
		}

	}
	
/*
		mOne.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                screenContent += "1";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "1")
            }
        });
        mTwo = (Button) findViewById(R.id.twob);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "2";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "2")
            }
        });
        mThree = (Button) findViewById(R.id.threeb);
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "3";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "3")
            }
        });
        mFour = (Button) findViewById(R.id.fourb);
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "4";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "4")
            }
        });
        mFive = (Button) findViewById(R.id.fiveb);
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "5";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "5")
            }
        });
        mSix = (Button) findViewById(R.id.sixb);
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "6";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "6")
            }
        });
        mSeven = (Button) findViewById(R.id.sevenb);
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "7";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "7")
            }
        });
        mEight = (Button) findViewById(R.id.eightb);
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "8";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "8")
            }
        });
        mNine = (Button) findViewById(R.id.nineb);
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "9";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "9")
            }
        });
        mZero = (Button) findViewById(R.id.zerob);
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "0";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                checkWhihcArgIsSet(firstArg, secondArg, operator, "0")
            }
        });
        mEqual = (Button) findViewById(R.id.equalb);
        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
        mMultiply = (Button) findViewById(R.id.multiplyb);
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "*";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "/";
            }
        });
        mDevide = (Button) findViewById(R.id.devideb);
        mDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "/";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "/";
            }
        });
        mMinus = (Button) findViewById(R.id.minusb);
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "-";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "-";
            }
        });
        mPlus = (Button) findViewById(R.id.plusb);
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent += "+";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                operator = "+";
            }
        });
        mClear = (Button) findViewById(R.id.clearb);
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenContent = "";
                mScreen.setText(screenContent.toCharArray(), 0, screenContent.toCharArray().length);
                firstArg = "";
                secondArg = "";
                operator = "";
            }
        });
        
        private void checkWhihcArgIsSet(String firstArg, String secondArg, String operator, String num) {
        	if (!firstArg.equals("")) this.firstArg += num;
        	if (!operator.equals("")) this.secondArg += num;
        }
        
        private void calculateResult() {
        	if (firstArg.equals("") | operator.equals("") | operator.equals("")) result = 0;
        	switch (operator) {
		case "+":
			result = (Integer.parseInt(firstArg) + Integer.parseInt(secondArg));
			break;
		case "-":
			result = (Integer.parseInt(firstArg) - Integer.parseInt(secondArg));
			break;
		case "/":
			result = (Integer.parseInt(firstArg) / Integer.parseInt(secondArg));
			break;
		case "*":
			result = (Integer.parseInt(firstArg) * Integer.parseInt(secondArg));
			break;
		default:
			result = 0;
			break;
        }
 */

}
