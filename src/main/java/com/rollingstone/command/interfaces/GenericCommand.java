package com.rollingstone.command.interfaces;

import java.io.Serializable;

import com.rollingstone.command.GenericCommandHeader;

public interface GenericCommand extends Serializable {

	 GenericCommandHeader getHeader();
	 void setHeader(GenericCommandHeader header);
}
