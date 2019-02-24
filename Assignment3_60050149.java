import java.awt.*;
import javax.swing.*;
class  Assignment3_60050149 extends JPanel implements Runnable
{
	public static void main(String[] args) 
	{
		Assignment3_60050149 m = new Assignment3_60050149();

		JFrame f =new JFrame();
		f.add(m);
		f.setTitle("Thailand In Your Mind");
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		(new Thread(m)).start();
	}
	private void plot(Graphics g,int x,int y,Color c)
	{
		g.fillRect(x, y, 5, 5);
	}
	double carMove=0;
	double ghostMove=0;
	double circleRotate = 0;
	double squareMove = -800;
	double squareMoveday = 1;
	double move = 0.7;
	double movesquare = 150;
	//int velX = 100;
	public void run()
	{
		double lastTime = System.currentTimeMillis();
		double currentTime;
		double elapsedTime;
		double startTime = System.currentTimeMillis();
		while (true)
		{
			currentTime = System.currentTimeMillis();
			elapsedTime = currentTime - lastTime;
			//animate
			
			carMove += -200 * elapsedTime / 1000.0; //~6sec

			if((int)(currentTime-startTime)>=9000)
				ghostMove += 200 * elapsedTime / 1000.0;

			if((currentTime-startTime)>=3500)
			{
				if (squareMoveday<=0)squareMoveday= 0;
				squareMoveday+= movesquare* elapsedTime / 1000.0;//day

				if (squareMove>=0)movesquare= 0;
				//if((currentTime-startTime)>=12000)
				//	if (squareMove>=0)movesquare= -movesquare;
					
				squareMove+= movesquare*elapsedTime / 1000.0;
			}

			//if (circleRotate >=2)circleRotate = circleRotate +=0* elapsedTime / 1000.0;;
			//		circleRotate += move* elapsedTime / 1000.0;

			
			repaint();
			
			lastTime = currentTime;
			
			try
			{
				Thread.sleep(1000/60);
			}
			catch (InterruptedException e)
			{
				System.err.println(e);
			}
		}
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Polygon poly = new Polygon();

		//------------------------day--------------------------
		g2.translate(0,squareMoveday); //move

		g.setColor(new Color(128,188,250));
		g2.fillRect(0,0,600,600); //main
	
		g.setColor(new Color(73,143,233));
		g2.fillRect(0,0,600,25);
	
		g.setColor(new Color(78,148,235));
		g2.fillRect(0,25,600,15);

		g.setColor(new Color(83,153,237));
		g2.fillRect(0,40,600,15);

		g.setColor(new Color(88,158,239));
		g2.fillRect(0,55,600,15);

		g.setColor(new Color(93,163,239));
		g2.fillRect(0,70,600,15);

		g.setColor(new Color(98,168,240));
		g2.fillRect(0,85,600,15);
	
		g.setColor(new Color(103,173,242));
		g2.fillRect(0,100,600,15);

		g.setColor(new Color(108,178,244));
		g2.fillRect(0,115,600,15);
	
		g.setColor(new Color(108,178,246));
		g2.fillRect(0,130,600,15);

		g.setColor(new Color(113,181,248));
		g2.fillRect(0,145,600,15);

		g.setColor(new Color(118,184,250));
		g2.fillRect(0,160,600,15);

		g.setColor(new Color(123,186,250));
		g2.fillRect(0,175,600,15);

		//g2.rotate(circleRotate,305,423);
		g.setColor(new Color(246,251,255));
		g2.fillOval(85,90,75,75);
		//g2.rotate(-circleRotate,305,423);

		g2.translate(0,-squareMoveday);

//-------------------Night-----------------------------
		g2.translate(0,squareMove); //move

		g.setColor(new Color(25,36,54));
		g2.fillRect(0,0,600,600); //main

		g.setColor(new Color(20,28,47));
		g2.fillOval(-30,35,650,160);

		g.setColor(new Color(17,24,42));
		g2.fillOval(-30,15,650,120);

		g.setColor(new Color(13,20,36));
		g2.fillOval(-30,0,650,80);

		g.setColor(new Color(9,15,29));
		g2.fillOval(-30,-15,650,55);	

//----------------------------------------

		g.setColor(new Color(25,36,54));  ///
		g2.fillRect(0,580,600,40);

		g.setColor(new Color(25,38,54));
		g2.fillRect(0,615,600,10);
	
		g.setColor(new Color(25,43,54));
		g2.fillRect(0,625,600,10);
	
		g.setColor(new Color(25,48,56));
		g2.fillRect(0,635,600,10);

		g.setColor(new Color(25,53,58));
		g2.fillRect(0,645,600,10);

		g.setColor(new Color(25,58,63));
		g2.fillRect(0,655,600,10);
	
		g.setColor(new Color(27,63,73));
		g2.fillRect(0,665,600,10);
	
		g.setColor(new Color(27,68,83));
		g2.fillRect(0,675,600,10);

		g.setColor(new Color(29,73,93));
		g2.fillRect(0,685,600,10);
	
		g.setColor(new Color(29,78,103));
		g2.fillRect(0,695,600,10);
	
		g.setColor(new Color(31,83,108));
		g2.fillRect(0,705,600,10);

		g.setColor(new Color(33,88,123));
		g2.fillRect(0,715,600,10);

		g.setColor(new Color(33,93,133));
		g2.fillRect(0,725,600,10);

		g.setColor(new Color(37,98,143));
		g2.fillRect(0,735,600,10);

		g.setColor(new Color(41,103,153));
		g2.fillRect(0,745,600,10);

		g.setColor(new Color(45,108,163));
		g2.fillRect(0,755,600,10);

		g.setColor(new Color(49,113,173));
		g2.fillRect(0,765,600,10);

		g.setColor(new Color(53,118,183));
		g2.fillRect(0,775,600,10);

		g.setColor(new Color(57,123,193));
		g2.fillRect(0,785,600,10);

		g.setColor(new Color(61,128,203));
		g2.fillRect(0,795,600,10);

		g.setColor(new Color(65,133,213));
		g2.fillRect(0,805,600,10);
	
		g.setColor(new Color(69,138,223));
		g2.fillRect(0,815,600,10); 
		


//--------------------------------
	

		g.setColor(new Color(196,216,239));
		g2.fillOval(35,60,7,7);
		g2.fillOval(200,90,7,7);
		g2.fillOval(108,135,7,7);
		g2.fillOval(300,70,7,7);
		g2.fillOval(400,120,7,7);
		g2.fillOval(470,155,7,7);
		g2.fillOval(520,140,7,7);
		g2.fillOval(87,80,4,4);
		g2.fillOval(42,115,3,3);
		g2.fillOval(30,145,3,3);
		g2.fillOval(67,133,3,3);
		g2.fillOval(210,83,3,3);
		g2.fillOval(260,95,3,3);
		g2.fillOval(350,85,3,3);
		g2.fillOval(330,55,3,3);
		g2.fillOval(395,140,3,3);
		g2.fillOval(335,120,3,3);
		g2.fillOval(390,20,3,3);
		g2.fillOval(410,70,3,3);
		g2.fillOval(200,170,3,3);
		g2.fillOval(250,175,3,3);
		g2.fillOval(180,160,3,3);
		g2.fillOval(200,135,3,3);
		g2.fillOval(500,50,3,3);
		g2.fillOval(210,45,2,2);
		g2.fillOval(335,165,7,7);
		poly.addPoint(335, 170);
		poly.addPoint(305, 140);
		poly.addPoint(340, 165);
		g2.drawPolygon(poly);
		g2.fillPolygon(poly);
		g.setColor(new Color(122,142,167));
		g2.fillOval(15,20,3,3);
		g2.fillOval(25,30,3,3);
		g2.fillOval(85,40,3,3);
		g2.fillOval(150,10,3,3);
		g2.fillOval(200,15,3,3);
		g2.fillOval(300,30,3,3);
		g2.fillOval(320,20,3,3);
		g2.fillOval(400,30,3,3);
		g2.fillOval(430,15,3,3);
		g2.fillOval(520,30,3,3);
		g2.fillOval(520,55,3,3);

		g.setColor(new Color(197,200,190));
		g2.fillOval(110,50,75,75);
		g2.translate(0,-squareMove);
		//end of sky

		/*----temple-------*/
		
		//pagoda
		poly.reset();
		g.setColor(new Color(214,166,75));
		poly.addPoint(44, 399); 
		poly.addPoint(34, 408); 
		poly.addPoint(230, 408);
		poly.addPoint(232, 389);
		poly.addPoint(231, 381);
		poly.addPoint(231, 370);
		poly.addPoint(232, 347);
		poly.addPoint(230, 340);
		poly.addPoint(234, 280);
		poly.addPoint(240, 248);
		poly.addPoint(250, 236);
		poly.addPoint(254, 202);
		poly.addPoint(258, 180);
		poly.addPoint(260, 144);
		poly.addPoint(260, 118);
		poly.addPoint(257, 119);
		poly.addPoint(256, 120);
		poly.addPoint(255, 122);
		poly.addPoint(253, 124);
		poly.addPoint(252, 127);
		poly.addPoint(251, 131);
		poly.addPoint(251, 143);
		poly.addPoint(252, 151);
		poly.addPoint(250, 156);
		poly.addPoint(248, 161);
		poly.addPoint(246, 165);
		poly.addPoint(245, 171);
		poly.addPoint(245, 175);
		poly.addPoint(246, 179);
		poly.addPoint(246, 182);
		poly.addPoint(244, 184);
		poly.addPoint(243, 189);
		poly.addPoint(242, 194);
		poly.addPoint(241, 198);
		poly.addPoint(241, 205);
		poly.addPoint(240, 205);
		poly.addPoint(239, 206);
		poly.addPoint(238, 209);
		poly.addPoint(238, 212);
		poly.addPoint(239, 214);
		poly.addPoint(238, 216);
		poly.addPoint(237, 220);
		poly.addPoint(235, 224);
		poly.addPoint(232, 228);
		poly.addPoint(230, 232);
		poly.addPoint(222, 241);
		poly.addPoint(214, 247);
		poly.addPoint(212, 250);
		poly.addPoint(207, 260);
		poly.addPoint(204, 273);
		poly.addPoint(202, 272);
		poly.addPoint(199, 277);
		poly.addPoint(198, 279);
		poly.addPoint(197, 283);
		poly.addPoint(198, 285);
		poly.addPoint(191, 291);
		poly.addPoint(187, 296);
		poly.addPoint(186, 299);
		poly.addPoint(181, 305);
		poly.addPoint(171, 317);
		poly.addPoint(156, 332);
		poly.addPoint(150, 336);
		poly.addPoint(144, 342);
		poly.addPoint(137, 348);
		poly.addPoint(131, 351);
		poly.addPoint(124, 356);
		poly.addPoint(107, 362);
		poly.addPoint(77, 379);
		g.drawPolygon(poly); g.fillPolygon(poly);
		

		poly.reset();
		g.setColor(new Color(255,215,141));
		poly.addPoint(260, 118);
		poly.addPoint(260, 144);
		poly.addPoint(258, 180);
		poly.addPoint(254, 202);
		poly.addPoint(250, 236);
		poly.addPoint(240, 248);
		poly.addPoint(234, 280);
		poly.addPoint(230, 340);
		poly.addPoint(232, 347);
		poly.addPoint(231, 370);
		poly.addPoint(231, 381);
		poly.addPoint(232, 389);
		poly.addPoint(230, 408);
		poly.addPoint(281, 408);
		poly.addPoint(279, 389);
		poly.addPoint(276, 371);
		poly.addPoint(274, 352);
		poly.addPoint(271, 328);
		poly.addPoint(268, 303);
		poly.addPoint(269, 273);
		poly.addPoint(268, 250);
		poly.addPoint(266, 239);
		poly.addPoint(260, 206);
		poly.addPoint(262, 191);
		poly.addPoint(262, 184);
		poly.addPoint(261, 176);
		poly.addPoint(261, 145);
		poly.addPoint(262, 100);
		poly.addPoint(264, 97);
		poly.addPoint(261, 79);
		poly.addPoint(259, 97);
		g.drawPolygon(poly); g.fillPolygon(poly);


		poly.reset();
		g.setColor(new Color(255,249,176));
		poly.addPoint(264, 97);
		poly.addPoint(262, 100);
		poly.addPoint(261, 145);
		poly.addPoint(261, 176);
		poly.addPoint(262, 184);
		poly.addPoint(262, 191);
		poly.addPoint(260, 206);
		poly.addPoint(266, 239);
		poly.addPoint(268, 250);
		poly.addPoint(269, 273);
		poly.addPoint(268, 303);
		poly.addPoint(271, 328);
		poly.addPoint(274, 352);
		poly.addPoint(276, 371);
		poly.addPoint(279, 389);
		poly.addPoint(281, 408);
		poly.addPoint(450, 408);
		poly.addPoint(433, 395);
		poly.addPoint(414, 383);
		poly.addPoint(396, 369);
		poly.addPoint(380, 358);
		poly.addPoint(362, 348);
		poly.addPoint(357, 343);
		poly.addPoint(351, 335);
		poly.addPoint(341, 323);
		poly.addPoint(328, 304);
		poly.addPoint(323, 296);
		poly.addPoint(318, 287);
		poly.addPoint(314, 280);
		poly.addPoint(308, 271);
		poly.addPoint(301, 261);
		poly.addPoint(293, 251);
		poly.addPoint(286, 240);
		poly.addPoint(284, 237);
		poly.addPoint(275, 218);
		poly.addPoint(273, 189);
		poly.addPoint(272, 184);
		poly.addPoint(270, 177);
		poly.addPoint(270, 147);
		poly.addPoint(269, 135);
		poly.addPoint(268, 129);
		poly.addPoint(266, 124);
		poly.addPoint(266, 120);
		poly.addPoint(263, 119);
		g.drawPolygon(poly); g.fillPolygon(poly);


		poly.reset();
		g.setColor(new Color(255,215,141));
		poly.addPoint(266, 120);
		poly.addPoint(266, 124);
		poly.addPoint(268, 129);
		poly.addPoint(269, 135);
		poly.addPoint(270, 147);
		poly.addPoint(270, 177);
		poly.addPoint(272, 184);
		poly.addPoint(273, 189);
		poly.addPoint(275, 218);
		poly.addPoint(284, 237);
		poly.addPoint(286, 240);
		poly.addPoint(293, 251);
		poly.addPoint(301, 261);
		poly.addPoint(308, 271);
		poly.addPoint(314, 280);
		poly.addPoint(318, 287);
		poly.addPoint(323, 296);
		poly.addPoint(328, 304);
		poly.addPoint(341, 323);
		poly.addPoint(351, 335);
		poly.addPoint(357, 343);
		poly.addPoint(362, 348);
		poly.addPoint(380, 358);
		poly.addPoint(396, 369);
		poly.addPoint(414, 383);
		poly.addPoint(433, 395);
		poly.addPoint(450, 408);
		poly.addPoint(502, 408);
		poly.addPoint(482, 396);
		poly.addPoint(457, 383);
		poly.addPoint(391, 351);
		poly.addPoint(334, 301);
		poly.addPoint(333, 296);
		poly.addPoint(329, 291);
		poly.addPoint(323, 287);
		poly.addPoint(323, 281);
		poly.addPoint(320, 275);
		poly.addPoint(317, 273);
		poly.addPoint(313, 259);
		poly.addPoint(307, 249);
		poly.addPoint(302, 245);
		poly.addPoint(295, 237);
		poly.addPoint(289, 227);
		poly.addPoint(285, 221);
		poly.addPoint(283, 215);
		poly.addPoint(284, 208);
		poly.addPoint(281, 204);
		poly.addPoint(280, 191);
		poly.addPoint(278, 185);
		poly.addPoint(276, 180);
		poly.addPoint(277, 170);
		poly.addPoint(276, 163);
		poly.addPoint(273, 158);
		poly.addPoint(270, 154);
		poly.addPoint(271, 148);
		poly.addPoint(272, 136);
		poly.addPoint(271, 128);
		poly.addPoint(269, 124);
		g.drawPolygon(poly); g.fillPolygon(poly);


		poly.reset();
		g.setColor(new Color(166,116,27));
		poly.addPoint(260, 118);
		poly.addPoint(257, 119);
		poly.addPoint(256, 120);
		poly.addPoint(255, 122);
		poly.addPoint(253, 124);
		poly.addPoint(252, 127);
		poly.addPoint(251, 131);
		poly.addPoint(251, 143);
		poly.addPoint(252, 151);
		poly.addPoint(250, 156);
		poly.addPoint(248, 161);
		poly.addPoint(246, 165);
		poly.addPoint(245, 171);
		poly.addPoint(245, 175);
		poly.addPoint(246, 179);
		poly.addPoint(246, 182);
		poly.addPoint(244, 184);
		poly.addPoint(243, 189);
		poly.addPoint(242, 194);
		poly.addPoint(241, 198);
		poly.addPoint(241, 205);
		poly.addPoint(240, 205);
		poly.addPoint(239, 206);
		poly.addPoint(238, 209);
		poly.addPoint(238, 212);
		poly.addPoint(239, 214);
		poly.addPoint(238, 216);
		poly.addPoint(237, 220);
		poly.addPoint(235, 224);
		poly.addPoint(232, 228);
		poly.addPoint(230, 232);
		poly.addPoint(222, 241);
		poly.addPoint(214, 247);
		poly.addPoint(212, 250);
		poly.addPoint(207, 260);
		poly.addPoint(204, 273);
		poly.addPoint(202, 272);
		poly.addPoint(199, 277);
		poly.addPoint(198, 279);
		poly.addPoint(197, 283);
		poly.addPoint(198, 285);
		poly.addPoint(191, 291);
		poly.addPoint(187, 296);
		poly.addPoint(186, 299);
		poly.addPoint(181, 305);
		poly.addPoint(171, 317);
		poly.addPoint(156, 332);
		poly.addPoint(150, 336);
		poly.addPoint(144, 342);
		poly.addPoint(137, 348);
		poly.addPoint(131, 351);
		poly.addPoint(124, 356);
		poly.addPoint(107, 362);
		poly.addPoint(77, 379);
		poly.addPoint(44, 399); 
		poly.addPoint(34, 408);
		poly.addPoint(54, 408);
		poly.addPoint(56, 402);
		poly.addPoint(58, 397);
		poly.addPoint(61, 393);
		poly.addPoint(64, 389);
		poly.addPoint(71, 384);
		poly.addPoint(78, 382);
		poly.addPoint(89, 378);
		poly.addPoint(126, 357);
		poly.addPoint(144, 347); 
		poly.addPoint(156, 339);
		poly.addPoint(177, 322);
		poly.addPoint(192, 307);
		poly.addPoint(201, 297);
		poly.addPoint(204, 292);
		poly.addPoint(207, 284);
		poly.addPoint(219, 261);
		poly.addPoint(230, 244);
		poly.addPoint(235, 240);
		poly.addPoint(239, 233);
		poly.addPoint(242, 226); 
		poly.addPoint(242, 220);
		poly.addPoint(246, 204);
		poly.addPoint(249, 184);
		poly.addPoint(251, 179);
		poly.addPoint(251, 174);
		poly.addPoint(251, 166);
		poly.addPoint(253, 157);
		poly.addPoint(257, 148);
		poly.addPoint(256, 133);
		poly.addPoint(257, 128);
		poly.addPoint(259, 124); 
		g.drawPolygon(poly); g.fillPolygon(poly);

		
		poly.reset();
		g.setColor(new Color(149,119,62));
		poly.addPoint(259, 98);
		poly.addPoint(259, 101);
		poly.addPoint(263, 101);
		poly.addPoint(264, 98);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(260, 108);
		poly.addPoint(260, 112);
		poly.addPoint(262, 111);
		poly.addPoint(262, 108);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(271, 144);
		poly.addPoint(264, 142);
		poly.addPoint(258, 142);
		poly.addPoint(252, 144);
		poly.addPoint(252, 147);
		poly.addPoint(259, 145);
		poly.addPoint(265, 145);
		poly.addPoint(271, 146);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		poly.addPoint(277, 178);
		poly.addPoint(269, 177);
		poly.addPoint(262, 177);
		poly.addPoint(253, 177);
		poly.addPoint(246, 178);
		poly.addPoint(246, 181);
		poly.addPoint(253, 180);
		poly.addPoint(262, 180);
		poly.addPoint(270, 180);
		poly.addPoint(276, 181);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(281, 202);
		poly.addPoint(272, 201);
		poly.addPoint(263, 201);
		poly.addPoint(251, 201);
		poly.addPoint(241, 202);
		poly.addPoint(241, 204);
		poly.addPoint(251, 203);
		poly.addPoint(263, 203);
		poly.addPoint(272, 203);
		poly.addPoint(281, 204);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(295, 237);
		poly.addPoint(286, 237);
		poly.addPoint(272, 236);
		poly.addPoint(254, 236);
		poly.addPoint(238, 237);
		poly.addPoint(225, 238);
		poly.addPoint(221, 242);
		poly.addPoint(228, 241);
		poly.addPoint(240, 240);
		poly.addPoint(253, 239);
		poly.addPoint(269, 238);
		poly.addPoint(285, 239);
		poly.addPoint(299, 241);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(306, 248);
		poly.addPoint(284, 247);
		poly.addPoint(259, 247);
		poly.addPoint(238, 248);
		poly.addPoint(220, 249);
		poly.addPoint(212, 250);
		poly.addPoint(211, 253);
		poly.addPoint(225, 252);
		poly.addPoint(243, 251);
		poly.addPoint(267, 250);
		poly.addPoint(292, 250);
		poly.addPoint(308, 251);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(317, 272);
		poly.addPoint(298, 270);
		poly.addPoint(277, 270);
		poly.addPoint(249, 271);
		poly.addPoint(222, 273);
		poly.addPoint(201, 275);
		poly.addPoint(200, 277);
		poly.addPoint(219, 275);
		poly.addPoint(238, 274);
		poly.addPoint(267, 272);
		poly.addPoint(299, 272);
		poly.addPoint(317, 273);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(133,104,52));
		poly.addPoint(284, 302);
		poly.addPoint(313, 303);
		poly.addPoint(338, 305);
		poly.addPoint(335, 301);
		poly.addPoint(317, 300);
		poly.addPoint(284, 299);
		poly.addPoint(264, 299);
		poly.addPoint(237, 300);
		poly.addPoint(210, 302);
		poly.addPoint(181, 305);
		poly.addPoint(179, 307);
		poly.addPoint(202, 305);
		poly.addPoint(228, 303);
		poly.addPoint(250, 303);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(122,77,21));
		poly.addPoint(388, 350);
		poly.addPoint(357, 348);
		poly.addPoint(335, 348);
		poly.addPoint(287, 347);
		poly.addPoint(251, 348);
		poly.addPoint(218, 349);
		poly.addPoint(181, 350);
		poly.addPoint(154, 352);
		poly.addPoint(128, 354);
		poly.addPoint(124, 357);
		poly.addPoint(154, 355);
		poly.addPoint(179, 353);
		poly.addPoint(210, 352);
		poly.addPoint(246, 352);
		poly.addPoint(285, 351);
		poly.addPoint(329, 351);
		poly.addPoint(379, 353);
		poly.addPoint(395, 354);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(420, 366);
		poly.addPoint(399, 365);
		poly.addPoint(360, 364);
		poly.addPoint(315, 364);
		poly.addPoint(268, 364);
		poly.addPoint(225, 366);
		poly.addPoint(179, 367);
		poly.addPoint(136, 370);
		poly.addPoint(103, 371);
		poly.addPoint(88, 372);
		poly.addPoint(85, 374);
		poly.addPoint(132, 372);
		poly.addPoint(171, 371);
		poly.addPoint(215, 370);
		poly.addPoint(260, 369);
		poly.addPoint(331, 368);
		poly.addPoint(337, 368);
		poly.addPoint(381, 368);
		poly.addPoint(413, 369);
		poly.addPoint(426, 369);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(112,87,43));
		poly.addPoint(446, 378);
		poly.addPoint(431, 377);
		poly.addPoint(410, 376);
		poly.addPoint(380, 376);
		poly.addPoint(364, 376);
		poly.addPoint(320, 375);
		poly.addPoint(287, 376);
		poly.addPoint(237, 377);
		poly.addPoint(209, 378);
		poly.addPoint(165, 380);
		poly.addPoint(128, 382);
		poly.addPoint(85, 384);
		poly.addPoint(64, 386);
		poly.addPoint(59, 389);
		poly.addPoint(80, 387);
		poly.addPoint(117, 385);
		poly.addPoint(168, 384);
		poly.addPoint(209, 382);
		poly.addPoint(255, 379);
		poly.addPoint(301, 378);
		poly.addPoint(341, 378);
		poly.addPoint(392, 378);
		poly.addPoint(430, 379);
		poly.addPoint(451, 381);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		poly.addPoint(468, 389);
		poly.addPoint(451, 388);
		poly.addPoint(437, 387);
		poly.addPoint(405, 387);
		poly.addPoint(369, 385);
		poly.addPoint(330, 385);
		poly.addPoint(295, 385);
		poly.addPoint(256, 386);
		poly.addPoint(219, 387);
		poly.addPoint(176, 388);
		poly.addPoint(134, 390);
		poly.addPoint(87, 391);
		poly.addPoint(51, 393);
		poly.addPoint(46, 396);
		poly.addPoint(74, 395);
		poly.addPoint(108, 394);
		poly.addPoint(154, 392);
		poly.addPoint(194, 391);
		poly.addPoint(233, 390);
		poly.addPoint(274, 389);
		poly.addPoint(312, 388);
		poly.addPoint(351, 388);
		poly.addPoint(388, 388);
		poly.addPoint(415, 389);
		poly.addPoint(446, 390);
		poly.addPoint(471, 391);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		//end of pagoda

		//extras1
		poly.reset();
		g.setColor(new Color(206,144,34));
		poly.addPoint(477, 404);
		poly.addPoint(476, 402);
		poly.addPoint(477, 389);
		poly.addPoint(476, 388);
		poly.addPoint(478, 375);
		poly.addPoint(479, 362);
		poly.addPoint(479, 347);
		poly.addPoint(477, 347);
		poly.addPoint(474, 360);
		poly.addPoint(475, 361);
		poly.addPoint(470, 375);
		poly.addPoint(472, 375);
		poly.addPoint(463, 389);
		poly.addPoint(472, 389);
		poly.addPoint(461, 404);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,206,93));
		poly.addPoint(479, 347);
		poly.addPoint(479, 362);
		poly.addPoint(478, 375);
		poly.addPoint(476, 388);
		poly.addPoint(477, 389);
		poly.addPoint(476, 402);
		poly.addPoint(477, 404);
		poly.addPoint(490, 404);
		poly.addPoint(488, 398);
		poly.addPoint(488, 396);
		poly.addPoint(486, 389);
		poly.addPoint(486, 384);
		poly.addPoint(485, 381);
		poly.addPoint(484, 379);
		poly.addPoint(484, 373);
		poly.addPoint(483, 366);
		poly.addPoint(482, 360);
		poly.addPoint(481, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,255,162));
		poly.addPoint(479, 344);
		poly.addPoint(481, 344);
		poly.addPoint(480, 313);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,255,77));
		poly.addPoint(481, 347);
		poly.addPoint(482, 360);
		poly.addPoint(483, 366);
		poly.addPoint(484, 373);
		poly.addPoint(484, 379);
		poly.addPoint(485, 381);
		poly.addPoint(486, 384);
		poly.addPoint(486, 389);
		poly.addPoint(488, 396);
		poly.addPoint(488, 398);
		poly.addPoint(490, 404);
		poly.addPoint(506, 404);
		poly.addPoint(494, 389);
		poly.addPoint(501, 389);
		poly.addPoint(490, 373);
		poly.addPoint(493, 373);
		poly.addPoint(486, 360);
		poly.addPoint(487, 360);
		poly.addPoint(484, 347);
		poly.addPoint(483, 344);
		poly.addPoint(482, 343);
		poly.addPoint(480, 342);
		poly.addPoint(479, 343);
		poly.addPoint(477, 344);
		poly.addPoint(477, 347);
		poly.addPoint(479, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		g.setColor(new Color(255,255,247));
		poly.addPoint(481, 347);
		poly.addPoint(482, 360);
		poly.addPoint(483, 366);
		poly.addPoint(484, 373);
		poly.addPoint(485, 374);
		poly.addPoint(485, 371);
		poly.addPoint(483, 362);
		poly.addPoint(483, 358);
		poly.addPoint(482, 352);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(106,83,37));
		g.drawRect(475,361,11,1);
		g.drawRect(470,374,22,1);
		g.drawRect(472,390,22,1);
		//end of extras1

		//extras2
		poly.reset();
		g.setColor(new Color(206,144,34));
		poly.addPoint(377, 404);
		poly.addPoint(376, 402);
		poly.addPoint(377, 389);
		poly.addPoint(376, 388);
		poly.addPoint(378, 375);
		poly.addPoint(379, 362);
		poly.addPoint(379, 347);
		poly.addPoint(377, 347);
		poly.addPoint(374, 360);
		poly.addPoint(375, 361);
		poly.addPoint(370, 375);
		poly.addPoint(372, 375);
		poly.addPoint(363, 389);
		poly.addPoint(372, 389);
		poly.addPoint(361, 404);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,206,93));
		poly.addPoint(379, 347);
		poly.addPoint(379, 362);
		poly.addPoint(378, 375);
		poly.addPoint(376, 388);
		poly.addPoint(377, 389);
		poly.addPoint(376, 402);
		poly.addPoint(377, 404);
		poly.addPoint(390, 404);
		poly.addPoint(388, 398);
		poly.addPoint(388, 396);
		poly.addPoint(386, 389);
		poly.addPoint(386, 384);
		poly.addPoint(385, 381);
		poly.addPoint(384, 379);
		poly.addPoint(384, 373);
		poly.addPoint(383, 366);
		poly.addPoint(382, 360);
		poly.addPoint(381, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,255,162));
		poly.addPoint(379, 344);
		poly.addPoint(381, 344);
		poly.addPoint(380, 313);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(255,255,77));
		poly.addPoint(381, 347);
		poly.addPoint(382, 360);
		poly.addPoint(383, 366);
		poly.addPoint(384, 373);
		poly.addPoint(384, 379);
		poly.addPoint(385, 381);
		poly.addPoint(386, 384);
		poly.addPoint(386, 389);
		poly.addPoint(388, 396);
		poly.addPoint(388, 398);
		poly.addPoint(390, 404);
		poly.addPoint(406, 404);
		poly.addPoint(394, 389);
		poly.addPoint(401, 389);
		poly.addPoint(390, 373);
		poly.addPoint(393, 373);
		poly.addPoint(386, 360);
		poly.addPoint(387, 360);
		poly.addPoint(384, 347);
		poly.addPoint(383, 344);
		poly.addPoint(382, 343);
		poly.addPoint(380, 342);
		poly.addPoint(379, 343);
		poly.addPoint(377, 344);
		poly.addPoint(377, 347);
		poly.addPoint(379, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		g.setColor(new Color(255,255,247));
		poly.addPoint(381, 347);
		poly.addPoint(382, 360);
		poly.addPoint(383, 366);
		poly.addPoint(384, 373);
		poly.addPoint(385, 374);
		poly.addPoint(385, 371);
		poly.addPoint(383, 362);
		poly.addPoint(383, 358);
		poly.addPoint(382, 352);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(106,83,37));
		g.drawRect(375,361,11,1);
		g.drawRect(370,374,22,1);
		g.drawRect(372,390,22,1);
		//end of extras2

		//extras3
		poly.reset();
		g.setColor(new Color(166,116,27));
		poly.addPoint(277, 404);
		poly.addPoint(276, 402);
		poly.addPoint(277, 389);
		poly.addPoint(276, 388);
		poly.addPoint(278, 375);
		poly.addPoint(279, 362);
		poly.addPoint(279, 347);
		poly.addPoint(277, 347);
		poly.addPoint(274, 360);
		poly.addPoint(275, 361);
		poly.addPoint(270, 375);
		poly.addPoint(272, 375);
		poly.addPoint(263, 389);
		poly.addPoint(272, 389);
		poly.addPoint(261, 404);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(214,166,75));
		poly.addPoint(279, 347);
		poly.addPoint(279, 362);
		poly.addPoint(278, 375);
		poly.addPoint(276, 388);
		poly.addPoint(277, 389);
		poly.addPoint(276, 402);
		poly.addPoint(277, 404);
		poly.addPoint(290, 404);
		poly.addPoint(288, 398);
		poly.addPoint(288, 396);
		poly.addPoint(286, 389);
		poly.addPoint(286, 384);
		poly.addPoint(285, 381);
		poly.addPoint(284, 379);
		poly.addPoint(284, 373);
		poly.addPoint(283, 366);
		poly.addPoint(282, 360);
		poly.addPoint(281, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(250,228,130));
		poly.addPoint(279, 344);
		poly.addPoint(281, 344);
		poly.addPoint(280, 313);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(244,210,62));
		poly.addPoint(281, 347);
		poly.addPoint(282, 360);
		poly.addPoint(283, 366);
		poly.addPoint(284, 373);
		poly.addPoint(284, 379);
		poly.addPoint(285, 381);
		poly.addPoint(286, 384);
		poly.addPoint(286, 389);
		poly.addPoint(288, 396);
		poly.addPoint(288, 398);
		poly.addPoint(290, 404);
		poly.addPoint(306, 404);
		poly.addPoint(294, 389);
		poly.addPoint(301, 389);
		poly.addPoint(290, 373);
		poly.addPoint(293, 373);
		poly.addPoint(286, 360);
		poly.addPoint(287, 360);
		poly.addPoint(284, 347);
		poly.addPoint(283, 344);
		poly.addPoint(282, 343);
		poly.addPoint(280, 342);
		poly.addPoint(279, 343);
		poly.addPoint(277, 344);
		poly.addPoint(277, 347);
		poly.addPoint(279, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		g.setColor(new Color(255,255,247));
		poly.addPoint(281, 347);
		poly.addPoint(282, 360);
		poly.addPoint(283, 366);
		poly.addPoint(284, 373);
		poly.addPoint(285, 374);
		poly.addPoint(285, 371);
		poly.addPoint(283, 362);
		poly.addPoint(283, 358);
		poly.addPoint(282, 352);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(106,83,37));
		g.drawRect(275,361,11,1);
		g.drawRect(270,374,22,1);
		g.drawRect(272,390,22,1);
		//end of extras3

		//extras4
		poly.reset();
		g.setColor(new Color(166,116,27));
		poly.addPoint(177, 404);
		poly.addPoint(176, 402);
		poly.addPoint(177, 389);
		poly.addPoint(176, 388);
		poly.addPoint(178, 375);
		poly.addPoint(179, 362);
		poly.addPoint(179, 347);
		poly.addPoint(177, 347);
		poly.addPoint(174, 360);
		poly.addPoint(175, 361);
		poly.addPoint(170, 375);
		poly.addPoint(172, 375);
		poly.addPoint(163, 389);
		poly.addPoint(172, 389);
		poly.addPoint(161, 404);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(214,166,75));
		poly.addPoint(179, 347);
		poly.addPoint(179, 362);
		poly.addPoint(178, 375);
		poly.addPoint(176, 388);
		poly.addPoint(177, 389);
		poly.addPoint(176, 402);
		poly.addPoint(177, 404);
		poly.addPoint(190, 404);
		poly.addPoint(188, 398);
		poly.addPoint(188, 396);
		poly.addPoint(186, 389);
		poly.addPoint(186, 384);
		poly.addPoint(185, 381);
		poly.addPoint(184, 379);
		poly.addPoint(184, 373);
		poly.addPoint(183, 366);
		poly.addPoint(182, 360);
		poly.addPoint(181, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(250,228,130));
		poly.addPoint(179, 344);
		poly.addPoint(181, 344);
		poly.addPoint(180, 313);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(244,210,62));
		poly.addPoint(181, 347);
		poly.addPoint(182, 360);
		poly.addPoint(183, 366);
		poly.addPoint(184, 373);
		poly.addPoint(184, 379);
		poly.addPoint(185, 381);
		poly.addPoint(186, 384);
		poly.addPoint(186, 389);
		poly.addPoint(188, 396);
		poly.addPoint(188, 398);
		poly.addPoint(190, 404);
		poly.addPoint(206, 404);
		poly.addPoint(194, 389);
		poly.addPoint(201, 389);
		poly.addPoint(190, 373);
		poly.addPoint(193, 373);
		poly.addPoint(186, 360);
		poly.addPoint(187, 360);
		poly.addPoint(184, 347);
		poly.addPoint(183, 344);
		poly.addPoint(182, 343);
		poly.addPoint(180, 342);
		poly.addPoint(179, 343);
		poly.addPoint(177, 344);
		poly.addPoint(177, 347);
		poly.addPoint(179, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		g.setColor(new Color(255,255,247));
		poly.addPoint(181, 347);
		poly.addPoint(182, 360);
		poly.addPoint(183, 366);
		poly.addPoint(184, 373);
		poly.addPoint(185, 374);
		poly.addPoint(185, 371);
		poly.addPoint(183, 362);
		poly.addPoint(183, 358);
		poly.addPoint(182, 352);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(106,83,37));
		g.drawRect(175,361,11,1);
		g.drawRect(170,374,22,1);
		g.drawRect(172,390,22,1);
		//end of extras4

		//extras5
		poly.reset();
		g.setColor(new Color(166,116,27));
		poly.addPoint(77, 404);
		poly.addPoint(76, 402);
		poly.addPoint(77, 389);
		poly.addPoint(76, 388);
		poly.addPoint(78, 375);
		poly.addPoint(79, 362);
		poly.addPoint(79, 347);
		poly.addPoint(77, 347);
		poly.addPoint(74, 360);
		poly.addPoint(75, 361);
		poly.addPoint(70, 375);
		poly.addPoint(72, 375);
		poly.addPoint(63, 389);
		poly.addPoint(72, 389);
		poly.addPoint(61, 404);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(214,166,75));
		poly.addPoint(79, 347);
		poly.addPoint(79, 362);
		poly.addPoint(78, 375);
		poly.addPoint(76, 388);
		poly.addPoint(77, 389);
		poly.addPoint(76, 402);
		poly.addPoint(77, 404);
		poly.addPoint(90, 404);
		poly.addPoint(88, 398);
		poly.addPoint(88, 396);
		poly.addPoint(86, 389);
		poly.addPoint(86, 384);
		poly.addPoint(85, 381);
		poly.addPoint(84, 379);
		poly.addPoint(84, 373);
		poly.addPoint(83, 366);
		poly.addPoint(82, 360);
		poly.addPoint(81, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(250,228,130));
		poly.addPoint(79, 344);
		poly.addPoint(81, 344);
		poly.addPoint(80, 313);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(244,210,62));
		poly.addPoint(81, 347);
		poly.addPoint(82, 360);
		poly.addPoint(83, 366);
		poly.addPoint(84, 373);
		poly.addPoint(84, 379);
		poly.addPoint(85, 381);
		poly.addPoint(86, 384);
		poly.addPoint(86, 389);
		poly.addPoint(88, 396);
		poly.addPoint(88, 398);
		poly.addPoint(90, 404);
		poly.addPoint(106, 404);
		poly.addPoint(94, 389);
		poly.addPoint(101, 389);
		poly.addPoint(90, 373);
		poly.addPoint(93, 373);
		poly.addPoint(86, 360);
		poly.addPoint(87, 360);
		poly.addPoint(84, 347);
		poly.addPoint(83, 344);
		poly.addPoint(82, 343);
		poly.addPoint(80, 342);
		poly.addPoint(79, 343);
		poly.addPoint(77, 344);
		poly.addPoint(77, 347);
		poly.addPoint(79, 347);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		poly.reset();
		g.setColor(new Color(255,255,247));
		poly.addPoint(81, 347);
		poly.addPoint(82, 360);
		poly.addPoint(83, 366);
		poly.addPoint(84, 373);
		poly.addPoint(85, 374);
		poly.addPoint(85, 371);
		poly.addPoint(83, 362);
		poly.addPoint(83, 358);
		poly.addPoint(82, 352);
		g.drawPolygon(poly); g.fillPolygon(poly);

		poly.reset();
		g.setColor(new Color(106,83,37));
		g.drawRect(75,361,11,1);
		g.drawRect(70,374,22,1);
		g.drawRect(72,390,22,1);
		//end of extras5

		/*end of temple*/

		//footpath
		g.setColor(new Color(124,124,124));
		g.fillRect(0,482,600,20);
		g.setColor(new Color(255,255,255));
		g.fillRect(0,502,600,13);
		g.setColor(new Color(255,0,0));
		for(int i=0;i<600;i+=20) g.fillRect(i,502,10,13);
		//end of footpath

		//road
		int R=90,G=90,B=90;
		for(int i=515;i<570;i+=4) 
		{
			g.setColor(new Color(R,G,B));
			g.fillRect(0,i,600,4);
			R-=6;G-=6;B-=6;
		}
		//g.fillRect(0,515,600,125);
		g.setColor(new Color(255,255,0));
		//for(int i=0;i<600;i+=50) g.fillRect(i,550,20,7);
		//end of road

		//wall
		g.setColor(new Color(234,229,160)); g.fillRect(0,402,600,80);
		g.setColor(new Color(186,181,105)); g.fillRect(2,404,10,75);
		g.setColor(new Color(186,181,105)); g.fillRect(232,404,10,75);
		g.setColor(new Color(186,181,105)); g.fillRect(462,404,10,75);
		g.setColor(new Color(131,124,53)); 
		g.fillRect(0,413,600,1);
		g.fillRect(0,424,600,3);
		g.fillRect(0,440,600,2);
		g.setColor(new Color(152,149,104));
		for(int i=0;i<600;i+=10) g.fillRect(i,402,3,11);
		//end of wall

		//car
		g2.translate(carMove,0);
		g.setColor(new Color(51,83,140));
		poly.addPoint(1034, 570);
		poly.addPoint(1034, 535);
		poly.addPoint(1029, 535);
		poly.addPoint(1029, 525);
		poly.addPoint(1024, 525);
		poly.addPoint(1024, 515);
		poly.addPoint(1019, 515);
		poly.addPoint(1019, 510);
		poly.addPoint(1014, 510);
		poly.addPoint(1014, 505);
		poly.addPoint(1009, 505);
		poly.addPoint(1009, 500);
		poly.addPoint(1004, 500);
		poly.addPoint(1004, 495);
		poly.addPoint(999, 495);
		poly.addPoint(999, 490);
		poly.addPoint(989, 490);
		poly.addPoint(989, 485);
		poly.addPoint(969, 485);
		poly.addPoint(969, 480);
		poly.addPoint(869, 480);//hightest

		poly.addPoint(869, 485);
		poly.addPoint(849, 485);
		poly.addPoint(849, 490);
		poly.addPoint(834, 490);
		poly.addPoint(834, 495);
		poly.addPoint(824, 495);
		poly.addPoint(824, 500);
		poly.addPoint(819, 500);
		poly.addPoint(819, 505);
		poly.addPoint(814, 505);
		poly.addPoint(814, 510);
		poly.addPoint(809, 510);
		poly.addPoint(809, 515);
		poly.addPoint(804, 515);
		poly.addPoint(804, 520);
		poly.addPoint(799, 520);
		poly.addPoint(799, 525);
		poly.addPoint(794, 525);
		poly.addPoint(794, 530);

		poly.addPoint(784, 530);
		poly.addPoint(784, 535);
		poly.addPoint(774, 535);
		poly.addPoint(774, 540);
		poly.addPoint(734, 540);
		poly.addPoint(734, 545);
		poly.addPoint(709, 545);
		poly.addPoint(709, 550);
		poly.addPoint(689, 550);
		poly.addPoint(689, 555);
		poly.addPoint(679, 555);
		poly.addPoint(679, 560);
		poly.addPoint(669, 560);
		poly.addPoint(669, 565);
		poly.addPoint(664, 565);
		poly.addPoint(664, 570);
		g.drawPolygon(poly); g.fillPolygon(poly);

		//glass1
		poly.reset();
		g.setColor(Color.WHITE);
		poly.addPoint(849, 490); 
		poly.addPoint(849, 495);
		poly.addPoint(834, 495);
		poly.addPoint(834, 500);
		poly.addPoint(824, 500);
		poly.addPoint(824, 505);
		poly.addPoint(819, 505);
		poly.addPoint(819, 510);
		poly.addPoint(814, 510);
		poly.addPoint(814, 515);
		poly.addPoint(809, 515);
		poly.addPoint(809, 520);
		poly.addPoint(804, 520);
		poly.addPoint(804, 525);
		poly.addPoint(799, 525);
		poly.addPoint(799, 530);
		poly.addPoint(794, 530);
		poly.addPoint(794, 535);
		poly.addPoint(784, 535);
		poly.addPoint(784, 539);
		poly.addPoint(899, 539);
		poly.addPoint(899, 519);
		poly.addPoint(904, 519);
		poly.addPoint(904, 504);
		poly.addPoint(909, 504);
		poly.addPoint(909, 490);
		g.drawPolygon(poly); g.fillPolygon(poly);
		
		//glass2
		poly.reset();
		poly.addPoint(924, 490);
		poly.addPoint(924, 539);
		poly.addPoint(1009, 539);
		poly.addPoint(1019, 539);
		poly.addPoint(1019, 535);
		poly.addPoint(1014, 535);
		poly.addPoint(1014, 525);
		poly.addPoint(1009, 525);
		poly.addPoint(1009, 515);
		poly.addPoint(1004, 515);
		poly.addPoint(1004, 510);
		poly.addPoint(999, 510);
		poly.addPoint(999, 505);
		poly.addPoint(989, 505);
		poly.addPoint(989, 500);
		poly.addPoint(984, 500);
		poly.addPoint(984, 495);
		poly.addPoint(979, 495);
		poly.addPoint(979, 490);
		poly.addPoint(974, 490);
		g.drawPolygon(poly); g.fillPolygon(poly);

		g.setColor(new Color(215,215,215));
		g.fillRect(784,534,110,4);
		g.fillRect(794,529,105,5);
		g.fillRect(854,524,45,5);
		g.fillRect(924,534,90,4);
		g.fillRect(924,529,55,5);
		g.fillRect(924,524,40,5);
		g.setColor(new Color(225,225,225));
		g.fillRect(859,519,40,5);
		g.fillRect(864,514,35,5);
		g.fillRect(924,519,35,5);
		g.fillRect(924,514,25,5);


		g.setColor(Color.BLACK);
		g.fillRect(897,549,12,4);

		g2.translate(-carMove,0);
		//end of car

		//ghost
		g2.translate(ghostMove,0);

		poly.reset();
		g.setColor(Color.WHITE);
		poly.addPoint(-43, 423);
		poly.addPoint(-46, 423);
		poly.addPoint(-49, 426);
		poly.addPoint(-51, 429);
		poly.addPoint(-53, 433);
		poly.addPoint(-55, 438);
		poly.addPoint(-56, 442);
		poly.addPoint(-58, 440);
		poly.addPoint(-58, 437);
		poly.addPoint(-60, 436);
		poly.addPoint(-62, 437);
		poly.addPoint(-63, 440);
		poly.addPoint(-62, 443);
		poly.addPoint(-60, 445);
		poly.addPoint(-58, 447);
		poly.addPoint(-61, 454);
		poly.addPoint(-67, 462);
		poly.addPoint(-73, 465);
		poly.addPoint(-75, 468);
		poly.addPoint(-75, 470);
		poly.addPoint(-70, 472);
		poly.addPoint(-62, 473);
		poly.addPoint(-53, 472);
		poly.addPoint(-44, 471);
		poly.addPoint(-37, 467);
		poly.addPoint(-31, 462);
		poly.addPoint(-27, 457);
		poly.addPoint(-23, 457);
		poly.addPoint(-18, 456);
		poly.addPoint(-15, 454);
		poly.addPoint(-15, 452);
		poly.addPoint(-17, 451);
		poly.addPoint(-19, 451);
		poly.addPoint(-22, 452);
		poly.addPoint(-25, 451);
		poly.addPoint(-22, 447);
		poly.addPoint(-21, 441);
		poly.addPoint(-21, 434);
		poly.addPoint(-23, 429);
		poly.addPoint(-28, 424);
		poly.addPoint(-35, 421);
		poly.addPoint(-39, 421);
		g.drawPolygon(poly); g.fillPolygon(poly);

		g.setColor(Color.BLACK);
		poly.reset();
		poly.addPoint(-41, 435);
		poly.addPoint(-43, 436);
		poly.addPoint(-42, 438);
		poly.addPoint(-40, 439);
		poly.addPoint(-38, 437);
		poly.addPoint(-39, 435);
		g.drawPolygon(poly); g.fillPolygon(poly);
		poly.reset();
		poly.addPoint(-30, 438);
		poly.addPoint(-32, 440);
		poly.addPoint(-31, 442);
		poly.addPoint(-29, 442);
		poly.addPoint(-27, 440);
		poly.addPoint(-28, 438);
		g.drawPolygon(poly); g.fillPolygon(poly);
		poly.reset();
		poly.addPoint(-40, 443);
		poly.addPoint(-42, 444);
		poly.addPoint(-41, 447);
		poly.addPoint(-38, 450);
		poly.addPoint(-35, 450);
		poly.addPoint(-32, 446);
		poly.addPoint(-33, 444);
		poly.addPoint(-35, 445);
		poly.addPoint(-36, 447);
		poly.addPoint(-39, 447);
		poly.addPoint(-39, 444);
		g.drawPolygon(poly); g.fillPolygon(poly);

		g2.translate(-ghostMove,0);
		//end of ghost
	}
}
