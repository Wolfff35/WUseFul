package com.wolff.wuseful;

import java.util.Date;

/**
 * Created by wolfff on 22.01.18.
 */

public class WTestObject {
    private double _id;
    private Date _date;

    public double get_id() {
        return _id;
    }

    public void set_id(double _id) {
        this._id = _id;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public double get_coord() {
        return _coord;
    }

    public void set_coord(double _coord) {
        this._coord = _coord;
    }

    private double _coord;
}
