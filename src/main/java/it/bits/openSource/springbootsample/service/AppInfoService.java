/*
 * Copyright (C) 2019-2020 Andrea Binello ("andbin")
 *
 * This file is part of the "Spring Boot 2 Web Thymeleaf Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package it.bits.openSource.springbootsample.service;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

import it.bits.openSource.springbootsample.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import org.thymeleaf.Thymeleaf;
import it.bits.openSource.springbootsample.model.AppInfo;

@Service
public class AppInfoService {
    @Autowired
    private ServletContext servletContext;

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaVmName(getJavaVmName());
        appInfo.setJavaVmVendor(getJavaVmVendor());
        appInfo.setJavaVmVersion(getJavaVmVersion());
        appInfo.setJavaRuntimeName(getJavaRuntimeName());
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setSpringVersion(getSpringVersion());
        appInfo.setSpringBootVersion(getSpringBootVersion());
        appInfo.setThymeleafVersion(getThymeleafVersion());
        appInfo.setSlf4jVersion(getSlf4jVersion());
        appInfo.setServerInfo(getServerInfo());
        appInfo.setVmStartTime(getVmStartZonedDateTime());
        appInfo.setCurrentTime(getCurrentZonedDateTime());
        List<Team> team = new ArrayList<>();
        /*Adding assignemnt group team members */
        /*Adding Vivek as  member - START*/
        Team vivek = new Team("VIVEK KR", "2020MT93523");
        team.add(vivek);
        /*Adding Vivek as member - END*/
        /*Adding Sainath as  member - START*/
        Team sai = new Team("SAINATH RAMIDI", "2020MT93527");
        team.add(sai);
        /*Adding Sainath as member - END*/
        /*Adding Harini as  member - START*/
        Team harini = new Team("HARINI BACHU", "2020MT93528");
        team.add(harini);
        /*Adding Shweta as  member - START*/
        Team shweta = new Team("SHWETA JALAN", "2020MT93704");
        team.add(shweta);
        /*Adding Shweta as member - END*/
        appInfo.setTeam(team);
        return appInfo;
    }


    private String getJavaVmName() {
        return getRuntimeMXBean().getVmName();
    }

    private String getJavaVmVendor() {
        return getRuntimeMXBean().getVmVendor();
    }

    private String getJavaVmVersion() {
        return getRuntimeMXBean().getVmVersion();
    }

    private String getJavaRuntimeName() {
        return System.getProperty("java.runtime.name");
    }

    private String getJavaRuntimeVersion() {
        return System.getProperty("java.runtime.version");
    }

    private String getSpringVersion() {
        return SpringVersion.getVersion();
    }

    private String getSpringBootVersion() {
        return SpringBootVersion.getVersion();
    }

    private String getThymeleafVersion() {
        return Thymeleaf.VERSION;
    }

    private String getSlf4jVersion() {
        Package slf4jPackage = Package.getPackage("org.slf4j");
        return slf4jPackage != null ? slf4jPackage.getImplementationVersion() : null;
    }

    private String getServerInfo() {
        return servletContext.getServerInfo();
    }

    private ZonedDateTime getVmStartZonedDateTime() {
        return ZonedDateTime.ofInstant(getVmStartInstant(), ZoneId.systemDefault());
    }

    private Instant getVmStartInstant() {
        return Instant.ofEpochMilli(getRuntimeMXBean().getStartTime());
    }

    private ZonedDateTime getCurrentZonedDateTime() {
        return ZonedDateTime.now();
    }

    private static RuntimeMXBean getRuntimeMXBean() {
        return ManagementFactory.getRuntimeMXBean();
    }
}
