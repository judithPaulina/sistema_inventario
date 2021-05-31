import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';

@Injectable({
  providedIn: 'root'
})
export class UtilitiesService {

  public positionToast: string = 'top-right';

  constructor(private messageService: MessageService) { }

  /**
       *
       * @param msg mensaje a mostrar en la alerta de exito - verde
       */
  // showToastSuccess(msg) {
  //   this.messageService.add({ severity: 'success', summary: '', detail: msg });
  // }
  // /**
  // *
  // * @param msg mensaje a mostrar en la alerta informativa - azul
  // */
  // showToastInfo(msg) {
  //   this.messageService.add({ severity: 'info', summary: '', detail: msg });
  // }
  // /**
  // *
  // * @param msg mensaje a mostrar en la alerta de advertencia - amarilla
  // */
  // showToastWarn(msg) {
  //   this.messageService.add({ severity: 'warn', summary: '', detail: msg });
  // }
  // /**
  // *
  // * @param msg mensaje a mostrar en la alerta de error - roja
  // */
  // showToastError(msg, toastPosition) {
  //   this.messageService.add({ severity: 'error', summary: '', detail: msg });
  //   this.positionToast = toastPosition;
  // }
}
