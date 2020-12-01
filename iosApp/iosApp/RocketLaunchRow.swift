//
//  RocketLaunchRow.swift
//  iosApp
//
//  Created by 박주성 on 12/2/20.
//  Copyright © 2020 orgName. All rights reserved.
//

import SwiftUI
import shared

struct RocketLauchRow: View {
    var rocketLaunch: RocketLaunch
    
    var body: some View {
        HStack() {
            VStack(alignment: .leading, spacing: 10) {
                Text("Launch name: \(rocketLaunch.missionName)")
                Text(launchText).foregroundColor(lauchColor)
                Text("Launch year: \(String(rocketLaunch.launchYear))")
                Text("Launch details: \(rocketLaunch.details ?? "")")
            }
            Spacer()
        }
    }
}

extension RocketLauchRow {
    private var launchText: String {
        if let isSuccess = rocketLaunch.launchSuccess {
            return isSuccess.boolValue ? "SuccessFul" : "Unsuccessful"
        } else {
            return "No data"
        }
    }
    
    private var lauchColor: Color {
        if let isSuccess = rocketLaunch.launchSuccess {
            return isSuccess.boolValue ? .green : .red
        } else {
            return .gray
        }
    }
}
