/*
*@author Kim Ngo
*@version 20193004
*ISTE - 121 - 01
*Class that implements Comparble interface, contains basic accessors and mutators for getting/setting CRC for a file 
*/

import java.io.File;

public class Info implements Comparable< Info >{
private File fileObject;
private long CRC;

	public Info(long crcVal2, File _file){
		CRC = crcVal2;
		fileObject = _file;
	}

	public long getCRC(){
		return CRC;
	}

	public void setCRC(long CRC2){
		CRC = CRC2;
	}

   public void setFileObj(File _fileObject){
		this.fileObject = _fileObject;
	}

	public File getFileObj(){
		return fileObject;
	}


	@Override
	public int compareTo(Info o) {
		return Long.compare(this.getCRC(),o.getCRC());
	}


}
