/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.consultoriomedicogui;

import com.itla.consultoriomedicobusiness.entity.Horario;
import com.itla.consultoriomedicobusiness.entity.Medico;
import com.itla.consultoriomedicobusiness.entity.Paciente;
import com.itla.consultoriomedicobusiness.entity.Cita;
import com.itla.consultoriomedicobusiness.enums.RepositoryEnum;
import com.itla.consultoriomedicobusiness.repository.MedicoRepository;
import com.itla.consultoriomedicobusiness.repository.PacienteRepository;
import com.itla.consultoriomedicobusiness.repository.factory.ApplicationContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLuis
 */
public class MainCita {
    
     public static void main(String[] args) {
         
         
        List<Medico> medicoList = getMedicos();
        List<Paciente> pacienteList = getPacientes();
        List<Horario> horarioList = getHorarios();
        

        Cita cita1 = new Cita();
        cita1.setMedico(medicoList.get(1));
        cita1.setPaciente(pacienteList.get(2));
        cita1.setHorario(horarioList.get(0));
       


        Cita cita2 = new Cita();
        cita2.setMedico(medicoList.get(0));
        cita2.setPaciente(pacienteList.get(1));
        cita2.setHorario(horarioList.get(0));
       

        Cita cita3 = new Cita();
        cita3.setMedico(medicoList.get(0));
        cita3.setPaciente(pacienteList.get(2));
        cita3.setHorario(horarioList.get(1));
       
     }

    private static List<Medico> getMedicos() {

        MedicoRepository medicoRepository = (MedicoRepository) ApplicationContext.getRePository(RepositoryEnum.MEDICO_REPOSITORY);

        
        Medico medico1 = new Medico();
        medico1.setNombre("Jose");
        medico1.setApellido("Perez");
        medico1.setEspecialidad("Cirujano");
        medico1.setExequatur("007");
        medico1.setInstitucion("CENTRO MEDICO UCE"); 
        medico1.setDireccion("Mama Tingo");
        medico1.setTelefono("809-221-0007");
        medico1.setId(1L);

        Medico medico2 = new Medico();
        medico2.setNombre("Jose");
        medico2.setApellido("Perez");
        medico2.setEspecialidad("Cirujano");
        medico2.setExequatur("007");
        medico2.setInstitucion("CENTRO MEDICO UCE"); 
        medico2.setDireccion("Mama Tingo");
        medico2.setTelefono("809-221-0007");
        medico2.setId(2L);

        Medico medico3 = new Medico();
        medico3.setNombre("Jose");
        medico3.setApellido("Perez");
        medico3.setEspecialidad("Cirujano");
        medico3.setExequatur("007");
        medico3.setInstitucion("CENTRO MEDICO UCE"); 
        medico3.setDireccion("Mama Tingo");
        medico3.setTelefono("809-221-0007");
        medico3.setId(3L);

        medicoRepository.save(medico1);
        medicoRepository.save(medico2);
        medicoRepository.save(medico3);

        return medicoRepository.findAll();

    }

    private static List<Paciente> getPacientes() {

        PacienteRepository PacienteRepository = (PacienteRepository) ApplicationContext.getRePository(RepositoryEnum.PACIENTE_REPOSITORY);

        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Jose");
        paciente1.setApellido("Martinez");
        paciente1.setCedula("224-06080709");
        paciente1.setDescripcion("Gatstritis");
        paciente1.setTelefono("849-989-5789");
        paciente1.setId(1L);

        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Miguel");
        paciente2.setApellido("Gonzales");
        paciente2.setCedula("224-06080709");
        paciente2.setDescripcion("Ameba");
        paciente2.setTelefono("849-989-5789");
        paciente2.setId(2L);

        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Misael");
        paciente3.setApellido("Portez");
        paciente3.setCedula("224-06080709");
        paciente3.setDescripcion("Fiebre");
        paciente3.setTelefono("849-989-5789");
        paciente3.setId(3L);

        PacienteRepository.save(paciente1);
        PacienteRepository.save(paciente2);
        PacienteRepository.save(paciente3);

        return PacienteRepository.findAll();

    }


    private static List<Horario> getHorarios() {

        List<Horario> horario = new ArrayList<>();
        Horario horario1 = new Horario();
        horario1.setId(1L);
        horario1.setDescripcion("Lun-Mie 9-1");

        Horario horario2 = new Horario();
        horario2.setId(2L);
        horario2.setDescripcion("Lun-Mie 2-6");

        Horario horario3 = new Horario();
        horario3.setId(3L);
        horario3.setDescripcion("Lun-Mie 6-10");

        horario.add(horario1);
        horario.add(horario2);
        horario.add(horario3);

        return horario;



    }
    
    
}
