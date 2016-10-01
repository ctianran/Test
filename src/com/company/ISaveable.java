package com.company;

import java.util.List;

/**
 * Created by Tianran on 10/1/2016.
 */
public interface ISaveable {

	List<String> write();
	void read(List<String> savedValues);

}
