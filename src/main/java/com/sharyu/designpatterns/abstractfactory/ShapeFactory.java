package com.sharyu.designpatterns.abstractfactory;

import com.sharyu.designpatterns.abstractfactory.service.Shape;
import com.sharyu.designpatterns.abstractfactory.service.impl.Rectangle;
import com.sharyu.designpatterns.abstractfactory.service.impl.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		 if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      return null;
	}

}
