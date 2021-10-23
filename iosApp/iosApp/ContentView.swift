import SwiftUI
import shared

struct ContentView: View {

	let repository = KMMRepository()

	var body: some View {
		Text(self.repository.getText())
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}