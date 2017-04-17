(function($) {

	function RemoteModel() {
		// private
		var data = {
			length : 0
		};
	
		// events
		var onDataLoading = new Slick.Event();
		var onDataLoaded = new Slick.Event();

		function init() {
		}

		function isDataLoaded(from, to) {
			for (var i = from; i <= to; i++) {
				if (data[i] == undefined || data[i] == null) {
					return false;
				}
			}

			return true;
		}

		function clear() {
			for ( var key in data) {
				delete data[key];
			}
			data.length = 0;
		}

		function ensureData(from, to) {
			if (from < 0) {
				from = 0;
			}

			if (data.length > 0) {
				to = Math.min(to, data.length - 1);
			}

			var url = "data/location.json";

			onDataLoading.notify({from: from, to: to});
			
			$.getJSON(url, function(response) {
				console.log(response);
			})
			.success(function(response) {
				if (response.result) {
					var from = 0, to = response.result.length;
				
					data.length = Math.min(to, 1000); // limitation of the API

					for (var i = 0; i < to; i++) {
						var item = response.result[i];

						data[i] = item;
						data[i].index = i;
					}

					onDataLoaded.notify({
						from : from,
						to : to
					});
				}
			});

		}

		function onError(from, to) {
			alert("error loading " + from + " to " + to);
		}

		function reloadData(from, to) {
			for (var i = from; i <= to; i++)
				delete data[i];

			ensureData(from, to);
		}

		function setSearch(str) {
			searchstr = str;
			clear();
		}

		init();

		return {
			// properties
			"data" : data,

			// methods
			"clear" : clear,
			"isDataLoaded" : isDataLoaded,
			"ensureData" : ensureData,
			"reloadData" : reloadData,
			"setSearch" : setSearch,

			// events
			"onDataLoading" : onDataLoading,
			"onDataLoaded" : onDataLoaded
		};
	}

	// Slick.Data.RemoteModel
	$.extend(true, window, {
		Slick : {
			Data : {
				RemoteModel : RemoteModel
			}
		}
	});
})(jQuery);