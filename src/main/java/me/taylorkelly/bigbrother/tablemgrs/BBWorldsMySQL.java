package me.taylorkelly.bigbrother.tablemgrs;

public class BBWorldsMySQL extends BBWorldsTable {

	@Override
	protected void onLoad() {
	}
	
	public String getCreateSyntax() {
		return "CREATE TABLE `"+getTableName()+"` ("
        + "`id` INTEGER PRIMARY KEY,"
        + "`name` varchar(50) NOT NULL DEFAULT 'world');";
	}

	@Override
	protected String getSelectWorldsQuery() {
		return "SELECT * FROM `" + getTableName() + "`;";
	}
	
	@Override
	protected String getInsertWorldQuery() {
		return "INSERT INTO " + getTableName() + " (id, name) VALUES (?,?)";
	}
}
