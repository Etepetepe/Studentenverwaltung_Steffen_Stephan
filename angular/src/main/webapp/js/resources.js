/**
 * The resources.
 * Created by Stephan on 18.12.2014.
 */
'use strict';

var resources = angular.module('resources', []);

resources.factory('Room', function () {
	return function (id, building, roomNumber, seats, beamerPresent) {
		this.id = id;
		this.building = building;
		this.roomNumber = roomNumber;
		this.seats = seats;
		this.beamerPresent = beamerPresent;
	};
});
